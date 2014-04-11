package nth.introspect.github.page.generator.element.page;

import java.util.ArrayList;
import java.util.List;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.page.content.WikiPageContent;
import nth.introspect.github.page.generator.element.page.detail.PageDetail;
import nth.introspect.github.page.generator.element.page.detail.PageDetailFactory;

public class PageFactory {

	public static List<Page> create(GitHubPageGeneratorConfig config) {
		List<Page> pages = new ArrayList<>();

		try {
			List<PageDetail> pageDetails = PageDetailFactory
					.createPageDetails(config);

			for (PageDetail pageDetail : pageDetails) {
				Element content = new WikiPageContent(config, pageDetail);
				LargePage page = new LargePage(config, pageDetail, content);
				pages.add(page);

				// TODO small page
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pages;
	}

}
