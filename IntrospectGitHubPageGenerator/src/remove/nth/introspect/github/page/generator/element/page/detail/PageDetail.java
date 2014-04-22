package remove.nth.introspect.github.page.generator.element.page.detail;

import java.net.URL;

import nth.introspect.util.TitleBuilder;

public class PageDetail {
	private final URL gitGubRepositoryWikiPage;
	private final String displayName;
	private PageDetail previousPage;
	private PageDetail homePage;
	private PageDetail nextPage;

	public PageDetail(URL gitGubRepositoryWikiPage, String displayName) {
		this.gitGubRepositoryWikiPage = gitGubRepositoryWikiPage;
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getPathName() {
		String path=getGitGubRepositoryWikiPage().getPath();
		String name=path.substring(path.lastIndexOf("/")+1);
		return name;
	}

	public String getFileNameForSmallPage() {
		String pathName = getPathName();
		StringBuilder name=new StringBuilder();
		name.append(pathName);
		name.append("-small.html");
		return name.toString();
	}

	public String getFileNameforLargePage() {
		String pathName = getPathName();
		StringBuilder name=new StringBuilder();
		name.append(pathName);
		name.append("-large.html");
		return name.toString();
	}

	
	
	public void setPreviousPage(PageDetail previousPage) {
		this.previousPage = previousPage;
	}

	public void setHomePage(PageDetail homePage) {
		this.homePage = homePage;
	}

	public void setNextPage(PageDetail nextPage) {
		this.nextPage = nextPage;
	}

	public PageDetail getPreviousPage() {
		return previousPage;
	}

	public PageDetail getHomePage() {
		return homePage;
	}

	public PageDetail getNextPage() {
		return nextPage;
	}

	@Override
	public String toString() {
		TitleBuilder title=new TitleBuilder();
		title.append(displayName);
		title.append(getGitGubRepositoryWikiPage());
		return title.toString();
	}

	public URL getGitGubRepositoryWikiPage() {
		return gitGubRepositoryWikiPage;
	}

	
	
}
