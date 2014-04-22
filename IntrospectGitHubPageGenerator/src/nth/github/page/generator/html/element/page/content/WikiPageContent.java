package nth.github.page.generator.html.element.page.content;

import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import remove.nth.introspect.github.page.generator.element.page.detail.PageDetail;
import nth.github.page.generator.GitHubPageGeneratorConfig;
import nth.github.page.generator.model.html.element.Element;
import nth.github.page.generator.model.html.element.ElementType;

public class WikiPageContent extends Element {

	public WikiPageContent(GitHubPageGeneratorConfig config,
			PageDetail pageDetail) {

		super(ElementType.DIV);
		try {
			Element h1 = addElement(ElementType.H1);
			h1.addText(pageDetail.getDisplayName());
			
			Element hr=addElement(ElementType.HR);

			URL url = pageDetail.getGitGubRepositoryWikiPage();
			Document doc = Jsoup.connect(url.toExternalForm()).get();

			// find DIV element that contains the Wiki page content
			Elements wikiContent = doc.select("div#wiki-content");

			String html = wikiContent.toString();
			addText(html);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
