package nth.introspect.github.page.generator.app;

import java.util.List;

import nth.introspect.github.page.generator.element.page.Page;
import nth.introspect.github.page.generator.element.page.PageFactory;


public class GitHubPageService {

	public void createPages(GitHubPageGeneratorConfig config){
		 List<Page> pages = PageFactory.create(config);
		 for (Page page : pages) {
			page.createPageFile();
		}
	}
}
