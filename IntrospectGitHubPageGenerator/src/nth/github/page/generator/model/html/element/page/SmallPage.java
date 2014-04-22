package nth.github.page.generator.model.html.element.page;

import java.io.File;

import remove.nth.introspect.github.page.generator.element.page.detail.PageDetail;
import nth.github.page.generator.GitHubPageGeneratorConfig;
import nth.github.page.generator.html.element.style.HtmlColor;
import nth.github.page.generator.html.element.style.StyleBuilder;
import nth.github.page.generator.model.html.element.AttributeType;
import nth.github.page.generator.model.html.element.Element;
import nth.github.page.generator.model.html.element.ElementType;
import nth.github.page.generator.model.text.ChapterLevel1;

public class SmallPage extends LargePage {

	private ChapterLevel1 chapterLevel1;

	public SmallPage(GitHubPageGeneratorConfig config, PageDetail pageDetail,
			Element contentElement) {
		super(config,  null, contentElement,null);
	}

	public SmallPage(GitHubPageGeneratorConfig config, String title, Element content) {
		super(config, null, content,title);
	}

	private static Element createContentElement(ChapterLevel1 chapterLevel1) {
		// TODO Auto-generated method stub
		return new Element(ElementType.DIV);
	}

	@Override
	public File getFile() {
		StringBuilder filePath = new StringBuilder();
		filePath.append(config.getHtmlFileDestination().getAbsoluteFile());
		filePath.append("/");
		filePath.append(getTitle().replace(" ", "-"));
		filePath.append("-small.html");
		return new File(filePath.toString());
	}

	@Override
	protected void createBody(Element html) {
		Element body = html.addElement(ElementType.BODY);
		createTitleBar(body);

		Element table = body.addElement(ElementType.TABLE);
		StyleBuilder styleBuilder = new StyleBuilder();
		styleBuilder.marginTop(TITLE_BAR_HEIGHT);
		styleBuilder.width(FULL_WIDTH);
		table.addAttribute(styleBuilder);

		Element tableRow = table.addElement(ElementType.TR);

		Element contentCell = tableRow.addElement(ElementType.TD);
		styleBuilder = new StyleBuilder();
		styleBuilder.width(FULL_WIDTH);
		styleBuilder.verticalAlign("top");
		contentCell.addAttribute(styleBuilder);

		Element contentDiv = contentCell.addElement(ElementType.DIV);
		contentDiv.addAttribute(AttributeType.ID, "content");
		styleBuilder = new StyleBuilder();
		styleBuilder.backGroundColor(HtmlColor.LIGHT_GRAY);
		styleBuilder.padding("7px");
		styleBuilder.borderRadius("10px");
		contentDiv.addAttribute(styleBuilder);
		contentDiv.addElement(contentElement);
	}


}
