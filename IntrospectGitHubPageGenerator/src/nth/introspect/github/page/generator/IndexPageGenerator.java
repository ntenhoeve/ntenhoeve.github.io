package nth.introspect.github.page.generator;

import java.io.File;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;

public class IndexPageGenerator extends PageGenerator {

	private GitHubPageGeneratorConfig config;

	public IndexPageGenerator(GitHubPageGeneratorConfig config) {
		this.config = config;
	}
	
	@Override
	public File getFile() {
		String filePath = config.getHtmlFileDestination().getAbsoluteFile()+"/index.html";
		return new File(filePath);
	}

	@Override
	public StringBuilder getHtml() {
		return new StringBuilder("Hello World");
	}

}
