package nth.introspect.github.page.generator.app;

import nth.introspect.github.page.generator.element.page.IndexPage;


public class GitHubPageService {

	public void createPages(GitHubPageGeneratorConfig config){
		 IndexPage indexPageGenerator=new IndexPage(config);
		 indexPageGenerator.createPageFile();
		 
	}
}
