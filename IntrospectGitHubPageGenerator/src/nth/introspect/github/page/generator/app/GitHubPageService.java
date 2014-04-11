package nth.introspect.github.page.generator.app;

import java.io.File;
import java.util.List;

import nth.introspect.github.page.generator.element.page.Page;
import nth.introspect.github.page.generator.element.page.PageFactory;


public class GitHubPageService {

	public void createPages(GitHubPageGeneratorConfig config){
		clearHtmlFolder(config);
		
		createHtmlFiles(config);
	}

	private void createHtmlFiles(GitHubPageGeneratorConfig config) {
		List<Page> pages = PageFactory.create(config);
		 for (Page page : pages) {
			page.createPageFile();
		}
	}

	private void clearHtmlFolder(GitHubPageGeneratorConfig config) {
		File htmlFolder = config.getHtmlFileDestination();
		File[] files = htmlFolder.listFiles();
		for (File file : files) {
			file.delete();
		}
	}
}
