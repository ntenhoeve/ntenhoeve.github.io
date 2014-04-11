package nth.introspect.github.page.generator.element.page.content;

import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.ElementType;
import nth.introspect.github.page.generator.element.page.detail.PageDetail;

public class WikiPageContent extends Element {

	public WikiPageContent(GitHubPageGeneratorConfig config,
			PageDetail pageDetail) {

		super(ElementType.DIV);
		try {

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
