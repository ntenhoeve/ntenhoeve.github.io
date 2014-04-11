package nth.introspect.github.page.generator.element.page;

import java.io.File;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.Element;

public class IndexPage extends Page {

	private GitHubPageGeneratorConfig config;

	public IndexPage(GitHubPageGeneratorConfig config) {
		this.config = config;
	}

	@Override
	public File getFile() {
		StringBuilder filePath = new StringBuilder();
		filePath.append(config.getHtmlFileDestination().getAbsoluteFile());
		filePath.append("/index.html");
		File file = new File(filePath.toString());
		return file;
	}

	@Override
	public Element getElement() {

		// TODO add js script to redirect to corresponding small or large home
		// page. Something like: if (screen.width <= 1024)
		// window.location.replace("http://www.example.com/1024.html") else
		// window.location.replace("http://www.example.com/index.html")
		return null;
	}

}
