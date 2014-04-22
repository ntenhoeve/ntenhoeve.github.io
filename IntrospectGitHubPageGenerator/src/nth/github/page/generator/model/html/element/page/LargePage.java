package nth.github.page.generator.model.html.element.page;

import java.io.File;

import remove.nth.introspect.github.page.generator.element.page.detail.PageDetail;
import nth.github.page.generator.GitHubPageGeneratorConfig;
import nth.github.page.generator.html.element.style.HtmlColor;
import nth.github.page.generator.html.element.style.HtmlPosition;
import nth.github.page.generator.html.element.style.StyleBuilder;
import nth.github.page.generator.model.html.element.AttributeType;
import nth.github.page.generator.model.html.element.Element;
import nth.github.page.generator.model.html.element.ElementType;

public class LargePage extends Page {

	protected static final String FULL_WIDTH = "100%";
	protected static final String TITLE_BAR_HEIGHT = "100px";
	private static final String BUTTON_SIZE = "25px";
	protected GitHubPageGeneratorConfig config;
	protected final Element contentElement;
	private final Element menuElement;
	private final String title;

	// TODO big screen small screen
	public LargePage(GitHubPageGeneratorConfig config, 
			Element menuElement, Element contentElement, String title) {
		super();
		this.config = config;
		this.menuElement = menuElement;
		this.contentElement = contentElement;
		this.title = title;
	}

	@Override
	public File getFile() {
		StringBuilder filePath = new StringBuilder();
		filePath.append(config.getHtmlFileDestination().getAbsoluteFile());
		filePath.append("/");
		return new File(filePath.toString());
	}

	@Override
	public Element getElement() {
		Element html = new Element(ElementType.HTML);
		StyleBuilder styleBuilder = new StyleBuilder()
				.backGroundColor(HtmlColor.DARK_GRAY);
		html.addAttribute(AttributeType.STYLE, styleBuilder.toString());

		// TODO add javascript to redirect to corresponding small page,
		// something like if (screen.width <= 1024)
		// window.location.replace("http://www.example.com/1024.html")
		createHead(html);// TODO validate title
		createBody(html);
		return html;
	}

	protected void createBody(Element html) {
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
		menuDiv.addElement(menuElement);

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

	protected void createTitleBar(Element body) {
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
		styleBuilder = new StyleBuilder().width("8cm");
		logo.addAttribute(styleBuilder);
		logo.addAttribute(AttributeType.SRC, "images/introspect.png");
		// TODO tooltip

		Element buttonBar = titleBar.addElement(ElementType.DIV);
		buttonBar.addAttribute(AttributeType.ID, "buttonBar");
		styleBuilder = new StyleBuilder();
		styleBuilder.position(HtmlPosition.ABSOLUTE);
		styleBuilder.bottom("0");
		styleBuilder.right("9px");
		styleBuilder.width("110px");
		buttonBar.addAttribute(styleBuilder);

		styleBuilder = new StyleBuilder();
		styleBuilder.floating("right");
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
		styleBuilder.marginRight("10px");
		
//		if (pageDetail.getNextPage() != null) {
//			Element a = buttonBar.addElement(ElementType.A);
//			a.addAttribute(AttributeType.HREF, pageDetail.getNextPage()
//					.getFileNameforLargePage());
//
//			Element nextButton = a.addElement(ElementType.DIV);
//			nextButton.addAttribute(styleBuilder);
//			nextButton.addAttribute(AttributeType.TITLE, "Next page");
//			nextButton.addText("&gt;");
//		}
//
//		
//		if (pageDetail.getHomePage() != null) {
//			Element a = buttonBar.addElement(ElementType.A);
//			a.addAttribute(AttributeType.HREF, pageDetail.getHomePage()
//					.getFileNameforLargePage());
//
//			Element homeButton = a.addElement(ElementType.DIV);
//			homeButton.addAttribute(styleBuilder);
//			homeButton.addAttribute(AttributeType.TITLE, "Home page");
//			homeButton.addText("^");
//		}
//
//		if (pageDetail.getPreviousPage() != null) {
//			Element a = buttonBar.addElement(ElementType.A);
//			a.addAttribute(AttributeType.HREF, pageDetail.getPreviousPage()
//					.getFileNameforLargePage());
//
//			Element previousButton = a.addElement(ElementType.DIV);
//			previousButton.addAttribute(styleBuilder);
//			previousButton.addAttribute(AttributeType.TITLE, "Previous page");
//			previousButton.addText("&lt;");
//		}

	}

	private void createHead(Element html) {
		Element head = html.addElement(ElementType.HEAD);

		Element meta = head.addElement(ElementType.META);
		meta.addAttribute("http-equiv", "Content-Type");
		meta.addAttribute("content", "text/html; charset=UTF-8");

		Element title = head.addElement(ElementType.TITLE);
		title.addText(this.getTitle());
	}

	public String getTitle() {
		return title;
	}


}
