package nth.introspect.github.page.generator.app;

import java.io.File;
import java.net.URI;
import java.net.URL;

public class GitHubPageGeneratorConfig {
	private URL urlGitHubRepositorySource;
	private File htmlFileDestination;

	public URL getUrlGitHubRepositorySource() {
		return urlGitHubRepositorySource;
	}

	public void setUrlGitHubRepositorySource(URL urlGitHubRepositorySource) {
		this.urlGitHubRepositorySource = urlGitHubRepositorySource;
	}

	public File getHtmlFileDestination() {
		return htmlFileDestination;
	}

	public void setHtmlFileDestination(File htmlFileDestination) {
		this.htmlFileDestination = htmlFileDestination;
	}

}
