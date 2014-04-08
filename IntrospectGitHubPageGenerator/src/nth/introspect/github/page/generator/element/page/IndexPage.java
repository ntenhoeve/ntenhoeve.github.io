package nth.introspect.github.page.generator.element.page;

import java.io.File;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.AttributeType;
import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.ElementType;
import nth.introspect.github.page.generator.element.style.HtmlColor;
import nth.introspect.github.page.generator.element.style.HtmlPosition;
import nth.introspect.github.page.generator.element.style.StyleBuilder;

public class IndexPage extends Page {

	private static final String FULL_WIDTH = "100%";
	private static final String TITLE_BAR_HEIGHT = "100px";
	private static final String BUTTON_SIZE = "25px";
	private GitHubPageGeneratorConfig config;

	public IndexPage(GitHubPageGeneratorConfig config) {
		this.config = config;
	}

	@Override
	public File getFile() {
		String filePath = config.getHtmlFileDestination().getAbsoluteFile()
				+ "/index.html";
		return new File(filePath);
	}

	@Override
	public Element getElement() {
		String pageTitle = getTitle();
		Element html = new Element(ElementType.HTML);
		StyleBuilder styleBuilder = new StyleBuilder()
				.backGroundColor(HtmlColor.DARK_GRAY);
		html.addAttribute(AttributeType.STYLE, styleBuilder.toString());
		createHead(pageTitle, html);
		createBody(pageTitle, html);
		return html;
	}

	private void createBody(String pageTitle, Element html) {
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
		menuDiv.setText("<b>Menu</b><br>HTML<br>CSS<br>JavaScript");

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
		contentDiv.setText("<h1>Content</h1><br>Text text bla bla ....");
	}

	private void createTitleBar(Element body) {
		Element titleBar = body.addElement(ElementType.DIV);
		titleBar.addAttribute(AttributeType.ID, "titleBar");
		StyleBuilder styleBuilder = new StyleBuilder();
		styleBuilder.position(HtmlPosition.FIXED);
		styleBuilder.top("0");
		styleBuilder.width(FULL_WIDTH);
		styleBuilder.height(TITLE_BAR_HEIGHT);
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
		previousButton.addAttribute(styleBuilder);
		// TODO tooltip
		previousButton.setText("&lt;");

		Element homeButton=buttonBar.addElement(ElementType.DIV);
		styleBuilder.marginLeft("10px");
		homeButton.addAttribute(styleBuilder);
		// TODO tooltip
		homeButton.setText("^");

		Element nextButton=buttonBar.addElement(ElementType.DIV);
		nextButton.addAttribute(styleBuilder);
		// TODO tooltip
		nextButton.setText("&gt;");
	}

	private void createHead(String pageTitle, Element html) {
		Element head = html.addElement(ElementType.HEAD);

		Element meta = head.addElement(ElementType.META);
		meta.addAttribute("http-equiv", "Content-Type");
		meta.addAttribute("content", "text/html; charset=UTF-8");

		Element title = head.addElement(ElementType.TITLE);
		title.setText(pageTitle);
	}

	private String getTitle() {
		String path = config.getUrlGitHubRepositorySource().getPath();
		String title = path.substring(path.lastIndexOf("/") + 1);
		return title;
	}

}
