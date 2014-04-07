package nth.introspect.github.page.generator.app;

import nth.introspect.github.page.generator.IndexPageGenerator;


public class GitHubPageService {

	public void createPages(GitHubPageGeneratorConfig config){
		 IndexPageGenerator indexPageGenerator=new IndexPageGenerator(config);
		 indexPageGenerator.createPageFile();
		 
	}
}
