package nth.github.page.generator.model.html.element.page;

import java.util.ArrayList;
import java.util.List;

import remove.nth.introspect.github.page.generator.element.page.detail.PageDetail;
import remove.nth.introspect.github.page.generator.element.page.detail.PageDetailFactory;
import nth.github.page.generator.GitHubPageGeneratorConfig;
import nth.github.page.generator.html.element.page.content.WikiPageContent;
import nth.github.page.generator.model.html.element.Element;

public class PageFactory {

	public static List<Page> create(GitHubPageGeneratorConfig config) {
		List<Page> pages = new ArrayList<>();

		try {
			List<PageDetail> allPageDetails = PageDetailFactory.createPageDetailsForAllPages(config);
			PageDetail menuPageDetail = PageDetailFactory.getMenuPage(allPageDetails);
			
			List<PageDetail> pageDetails = PageDetailFactory
					.createPageDetails(config, false);

			
			WikiPageContent menu = new WikiPageContent(config,menuPageDetail);
			for (PageDetail pageDetail : pageDetails) {
				Element content = new WikiPageContent(config, pageDetail);
				
				String path = config.getGitHubRepository().getPath();
				String title = path.substring(path.lastIndexOf("/") + 1);
				LargePage page = new LargePage(config,  menu, content,title);
				pages.add(page);
			}

			
			pageDetails = PageDetailFactory
					.createPageDetails(config, true);
			for (PageDetail pageDetail : pageDetails) {
				Element content = new WikiPageContent(config, pageDetail);
				LargePage page = new SmallPage(config, pageDetail, content);
				pages.add(page);
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pages;
	}

}
