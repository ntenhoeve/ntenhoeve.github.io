package nth.introspect.github.page.generator.element.page;

import java.io.File;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.AttributeType;
import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.ElementType;
import nth.introspect.github.page.generator.element.page.detail.PageDetail;
import nth.introspect.github.page.generator.element.style.HtmlColor;
import nth.introspect.github.page.generator.element.style.HtmlPosition;
import nth.introspect.github.page.generator.element.style.StyleBuilder;

public class LargePage extends Page {

	private static final String FULL_WIDTH = "100%";
	private static final String TITLE_BAR_HEIGHT = "100px";
	private static final String BUTTON_SIZE = "25px";
	private GitHubPageGeneratorConfig config;
	private PageDetail pageDetail;
	private final Element contentElement;

	//TODO big screen small screen
	public LargePage(GitHubPageGeneratorConfig config, PageDetail pageDetail,Element contentElement) {
		this.config = config;
		this.pageDetail = pageDetail;
		this.contentElement = contentElement;
	}

	@Override
	public File getFile() {
		StringBuilder filePath=new StringBuilder();
		filePath.append(config.getHtmlFileDestination().getAbsoluteFile());
		filePath.append("/");
		filePath.append(pageDetail.getFileNameforLargePage());
		filePath.append(".html");
		return new File(filePath.toString());
	}

	@Override
	public Element getElement() {
		Element html = new Element(ElementType.HTML);
		StyleBuilder styleBuilder = new StyleBuilder()
				.backGroundColor(HtmlColor.DARK_GRAY);
		html.addAttribute(AttributeType.STYLE, styleBuilder.toString());
		
		//TODO add javascript to redirect to corresponding small page, something like if (screen.width <= 1024) window.location.replace("http://www.example.com/1024.html")
		createHead(html);//TODO validate title
		createBody( html);
		return html;
	}

	private void createBody( Element html) {
		Element body = html.addElement(ElementType.BODY);
		createTitleBar(body);

		Element table = body.addElement(ElementType.TABLE);
		StyleBuilder styleBuilder = new StyleBuilder();
		styleBuilder.marginTop(TITLE_BAR_HEIGHT);
		styleBuilder.width(FULL_WIDTH);
		table.addAttribute(styleBuilder);

		Element tableRow = table.addElement(ElementType.TR);

		Element menuCell = tableRow.addElement(ElementType.TD);

		styleBuilder = new StyleBuilder();
		styleBuilder.width("25%");
		styleBuilder.verticalAlign("top");
		menuCell.addAttribute(styleBuilder);

		Element menuDiv = menuCell.addElement(ElementType.DIV);
		menuDiv.addAttribute(AttributeType.ID, "menu");
		styleBuilder = new StyleBuilder();
		styleBuilder.backGroundColor(HtmlColor.LIGHT_GRAY);
		styleBuilder.padding("7px");
		styleBuilder.borderRadius("10px");
		menuDiv.addAttribute(styleBuilder);
		menuDiv.addText("<b>Menu</b><br>HTML<br>CSS<br>JavaScript");

		Element contentCell = tableRow.addElement(ElementType.TD);
		styleBuilder = new StyleBuilder();
		styleBuilder.width("75%");
		styleBuilder.paddingLeft("10px");
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

	private void createTitleBar(Element body) {
		Element titleBar = body.addElement(ElementType.DIV);
		titleBar.addAttribute(AttributeType.ID, "titleBar");
		StyleBuilder styleBuilder = new StyleBuilder();
		styleBuilder.position(HtmlPosition.FIXED);
		styleBuilder.top("0");
		styleBuilder.width(FULL_WIDTH);
		styleBuilder.height(TITLE_BAR_HEIGHT);
		styleBuilder.backGroundColor(HtmlColor.DARK_GRAY);
		titleBar.addAttribute(styleBuilder);

		Element logo = titleBar.addElement(ElementType.IMG);
		titleBar.addAttribute(AttributeType.ID, "titleLogo");
		styleBuilder=new StyleBuilder().width("8cm");
		logo.addAttribute( styleBuilder);
		logo.addAttribute(AttributeType.SRC, "images/introspect.png");
		// TODO tooltip

		Element buttonBar = titleBar.addElement(ElementType.DIV);
		buttonBar.addAttribute(AttributeType.ID, "buttonBar");
		styleBuilder=new StyleBuilder();
		styleBuilder.position(HtmlPosition.ABSOLUTE);
		styleBuilder.bottom("0");
		styleBuilder.right("0");
		styleBuilder.width("114px");
		buttonBar.addAttribute(styleBuilder);

		Element previousButton=buttonBar.addElement(ElementType.DIV);
		styleBuilder=new StyleBuilder();
		styleBuilder.floating("left");
		styleBuilder.backGroundColor(HtmlColor.GRAY);
		styleBuilder.width(BUTTON_SIZE);
		styleBuilder.height(BUTTON_SIZE);
		styleBuilder.marginBottom("5px");
		styleBuilder.borderRadius("5px");
		styleBuilder.color(HtmlColor.WHITE);
		styleBuilder.fontFamily("Arial Black");
		styleBuilder.fontSize("18px");
		styleBuilder.textAlign("center");
		styleBuilder.cursor("pointer");
		previousButton.addAttribute(styleBuilder);
		// TODO tooltip
		previousButton.addText("&lt;");

		Element homeButton=buttonBar.addElement(ElementType.DIV);
		styleBuilder.marginLeft("10px");
		homeButton.addAttribute(styleBuilder);
		// TODO tooltip
		homeButton.addText("^");

		Element nextButton=buttonBar.addElement(ElementType.DIV);
		nextButton.addAttribute(styleBuilder);
		// TODO tooltip
		nextButton.addText("&gt;");
	}

	private void createHead( Element html) {
		Element head = html.addElement(ElementType.HEAD);

		Element meta = head.addElement(ElementType.META);
		meta.addAttribute("http-equiv", "Content-Type");
		meta.addAttribute("content", "text/html; charset=UTF-8");

		Element title = head.addElement(ElementType.TITLE);
		title.addText(getTitle());
	}

	private String getTitle() {
		String path = config.getGitHubRepository().getPath();
		String title = path.substring(path.lastIndexOf("/") + 1);
		return title;
	}

}
