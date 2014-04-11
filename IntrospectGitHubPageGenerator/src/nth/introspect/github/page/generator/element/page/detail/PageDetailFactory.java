package nth.introspect.github.page.generator.element.page.detail;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PageDetailFactory {

	public static List<PageDetail> createPageDetails(
			GitHubPageGeneratorConfig config) {
		URL wikiHome = config.getGitHubRepositoryWikiHome();

		List<PageDetail> pageDetails = createPageDetails(wikiHome, wikiHome);

		populateNextHomePreviousPages(pageDetails);

		addMissingPageDetails(pageDetails, config);
		
		return pageDetails;
	}


	private static List<PageDetail> createPageDetailsForAllPages(
			GitHubPageGeneratorConfig config) {
		URL wikiHome = config.getGitHubRepositoryWikiHome();
		URL wikiPages = config.getGitHubRepositoryWikiPages();
		return createPageDetails(wikiHome, wikiPages);
	}

	/**
	 * add the page details of the pages that are in the Github Wiki but are not
	 * mentioned in the wiki home page because they may be referenced indirectly
	 * 
	 * @param pageDetails
	 * @param config
	 */
	private static void addMissingPageDetails(List<PageDetail> pageDetails,
			GitHubPageGeneratorConfig config) {
		List<PageDetail> allPageDetails = createPageDetailsForAllPages(config);

		PageDetail homePage = pageDetails.get(0);

		for (PageDetail pageDetail : allPageDetails) {
			if (!containsPageDetail(pageDetails, pageDetail)) {
				pageDetail.setHomePage(homePage);
				pageDetails.add(pageDetail);
			}
		}
	}

	private static boolean containsPageDetail(List<PageDetail> pageDetails,
			PageDetail pageDetailToFind) {
		for (PageDetail pageDetail : pageDetails) {
			if (pageDetail.getPathName().equals(pageDetailToFind.getPathName())) {
				return true;
			}
		}
		return false;
	}

	private static void populateNextHomePreviousPages(
			List<PageDetail> pageDetails) {
		PageDetail homePage = pageDetails.get(0);
		for (int index = 0; index < pageDetails.size(); index++) {
			PageDetail pageDetail = pageDetails.get(index);
			pageDetail.setHomePage(homePage);
			if (index > 0) {
				PageDetail previousPage = pageDetails.get(index - 1);
				pageDetail.setPreviousPage(previousPage);
			}
			if (index + 1 < pageDetails.size()) {
				PageDetail nextPage = pageDetails.get(index + 1);
				pageDetail.setNextPage(nextPage);
			}
		}
	}

	private static List<PageDetail> createPageDetails(URL wikiHome, URL sourceToGetPageDetails) {
		List<PageDetail> pageDetails = new ArrayList<>();

		try {
			Document doc = Jsoup.connect(sourceToGetPageDetails.toExternalForm()).get();

			// find div that contains the wiki page content with page
			// references.
			Elements wikiContent = doc.select("div#wiki-content");
			Elements links = wikiContent.select("a[href]");

			
			for (org.jsoup.nodes.Element link : links) {
				String pageUrl = link.attr("abs:href");
				String pageDisplayName = link.text();
				if (notEmpty(pageDisplayName) && notEmpty( pageUrl) && isWikiPage(pageUrl, wikiHome) ) {
					PageDetail pageDetail = new PageDetail(new URL(pageUrl),
							pageDisplayName);
					pageDetails.add(pageDetail);
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pageDetails;

	}

	private static boolean isWikiPage(String pageUrl, URL wikiHome) {
		return pageUrl.startsWith(wikiHome.toString());
	}

	private static boolean notEmpty(String string) {
		return string!=null && string.trim().length()>0;
	}


}
