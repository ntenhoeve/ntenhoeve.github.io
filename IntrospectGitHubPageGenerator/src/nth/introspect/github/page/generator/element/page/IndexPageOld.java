package nth.introspect.github.page.generator.element.page;

import java.io.File;

import nth.introspect.github.page.generator.app.GitHubPageGeneratorConfig;
import nth.introspect.github.page.generator.element.AttributeType;
import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.ElementType;

public class IndexPageOld extends Page {

	private GitHubPageGeneratorConfig config;

	public IndexPageOld(GitHubPageGeneratorConfig config) {
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
		html.addAttribute(AttributeType.STYLE, "height:100%;");
		createHead(pageTitle, html);
		createBody(pageTitle, html);
		return html;
	}

	private void createBody(String pageTitle, Element html) {
		Element body = html.addElement(ElementType.BODY);
		//body.addAttribute(AttributeType.STYLE, "margin:0px;padding:0px;height:100%;");
		body.addAttribute(AttributeType.STYLE, "height:100%;");
		Element table = createTable(body);
		createTitleBar(pageTitle, table);
		Element tr = createMenuAndContentRow(table);
		createMenuColumn(tr);
		createContentColumn(tr);
	}

	private void createContentColumn(Element tr) {
		Element td = tr.addElement(ElementType.TD);
		td.addAttribute(AttributeType.STYLE,
				"background-color:#eeeeee;text-align:top;");
		td.setText("<b>Content Title</b><br />Content");
	}

	private Element createMenuAndContentRow(Element table) {
		Element tr = table.addElement(ElementType.TR);
		tr.addAttribute(AttributeType.VALIGN, "top");
		return tr;
	}

	private Element createTable(Element body) {
		Element table = body.addElement(ElementType.TABLE);
		table.addAttribute(AttributeType.STYLE, "width:100%;height:100%;");
		table.addAttribute(AttributeType.BORDER, "0");
		return table;
	}

	private void createHead(String pageTitle, Element html) {
		Element head = html.addElement(ElementType.HEAD);

		Element meta = head.addElement(ElementType.META);
		meta.addAttribute("http-equiv", "Content-Type");
		meta.addAttribute("content", "text/html; charset=UTF-8");

		Element title = head.addElement(ElementType.TITLE);
		title.setText(pageTitle);
	}

	private void createMenuColumn(Element tr) {
		Element td = tr.addElement(ElementType.TD);
		td.addAttribute(AttributeType.STYLE,
				"background-color:#FFCCFF;text-align:top;width=25%");
		td.setText("<b>Main Menu</b><br />HTML<br />PHP<br />PERL...");
	}

	private void createTitleBar(String pageTitle, Element table) {
		Element tr = table.addElement(ElementType.TR);

		Element td = tr.addElement(ElementType.TD);
		td.addAttribute(AttributeType.COLSPAN, "2");
		td.addAttribute(AttributeType.STYLE, "background-color:#CC99FF;height:15%");

		Element h1 = td.addElement(ElementType.H1);
		h1.setText(pageTitle);
	}

	private String getTitle() {
		String path = config.getUrlGitHubRepositorySource().getPath();
		String title = path.substring(path.lastIndexOf("/") + 1);
		return title;
	}

}
