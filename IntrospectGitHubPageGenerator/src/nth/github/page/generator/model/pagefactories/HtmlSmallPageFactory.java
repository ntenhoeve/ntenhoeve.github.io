package nth.github.page.generator.model.pagefactories;

import java.util.ArrayList;
import java.util.List;

import nth.github.page.generator.GitHubPageGeneratorConfig;
import nth.github.page.generator.html.element.page.content.ContentFactory;
import nth.github.page.generator.model.html.element.Element;
import nth.github.page.generator.model.html.element.ElementType;
import nth.github.page.generator.model.html.element.page.Page;
import nth.github.page.generator.model.html.element.page.PageFactory;
import nth.github.page.generator.model.html.element.page.SmallPage;
import nth.github.page.generator.model.text.ChapterLevel1;
import nth.github.page.generator.model.text.TextDocument;

public class HtmlSmallPageFactory {

	public static List<Page> create(GitHubPageGeneratorConfig config,
			TextDocument textDocument) {
		List<Page> smallPages = new ArrayList<>();

		List<ChapterLevel1> chapters = textDocument.getChapterLevels1();

		for (ChapterLevel1 chapterLevel1 : chapters) {

			Element content=ContentFactory.create(chapterLevel1,null);
			
			SmallPage smallPage = new SmallPage(config,
					chapterLevel1.getTitle(), content);
			smallPages.add(smallPage);
		}
		return smallPages;
	}

	public static void createFiles(GitHubPageGeneratorConfig config,
			TextDocument textDocument) {
		List<Page> pages = create(config, textDocument);

		for (Page page : pages) {
			page.createPageFile();
		}

	}

}
