package nth.introspect.github.page.generator.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class GitHubPageGeneratorConfig {
	private URL gitHubRepository;
	private File htmlFileDestination;

	public URL getGitHubRepository() {
		return gitHubRepository;
	}

	public void setGitHubRepository(URL gitHubRepository) {
		this.gitHubRepository = gitHubRepository;
	}

	public File getHtmlFileDestination() {
		return htmlFileDestination;
	}

	public void setHtmlFileDestination(File htmlFileDestination) {
		this.htmlFileDestination = htmlFileDestination;
	}

	public URL getGitHubRepositoryWikiHome() {
		try {
			URL gitHubRepositoryWikiHome = new URL(gitHubRepository.toString()
					+ "/wiki");
			return gitHubRepositoryWikiHome;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public URL getGitHubRepositoryWikiPages() {
		try {
			URL gitHubRepositoryWikiPages = new URL(gitHubRepository.toString()
					+ "/wiki");
			return gitHubRepositoryWikiPages;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
