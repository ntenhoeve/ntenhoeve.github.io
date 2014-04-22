package nth.github.page.generator.html.element.page.content;

import java.util.List;

import nth.github.page.generator.model.html.element.AttributeType;
import nth.github.page.generator.model.html.element.Element;
import nth.github.page.generator.model.html.element.ElementType;
import nth.github.page.generator.model.text.ChapterLevel1;
import nth.github.page.generator.model.text.ChapterLevel2;
import nth.github.page.generator.model.text.HyperLink;
import nth.github.page.generator.model.text.Node;
import nth.github.page.generator.model.text.Text;

public class ContentFactory {

	public static Element create(ChapterLevel1 chapterLevel1, ChapterLevel2 chapterLevel2) {

		Element div = new Element(ElementType.DIV);

		Element h1 = div.addElement(ElementType.H1);
		h1.addText(chapterLevel1.getTitle());
		
		create(chapterLevel1.getChilderen(), div);
		
		if (chapterLevel2==null) {
			//add links for all sub chapters
			List<Node> subChapters = chapterLevel1.findChilderenOfType(ChapterLevel2.class);
			Element list = div.addElement(ElementType.UL);
			
			for (Node node : subChapters) {
				Element item = list.addElement(ElementType.LI);;
				Element link = item.addElement(ElementType.A);
				ChapterLevel2 subChapter = (ChapterLevel2)node; 
				link.addText(subChapter.getTitle());
				//TODO link.addAttribute(AttributeType.HREF,);
			}
			
			
			
		}
		return div;
	}

	private static void create(List<Node> children, Element div) {
		for (Node node : children) {
			if (node instanceof Text) {
				Text textNode = (Text) node;
				String text=textNode.getText();
				if (text == null) {
					div.addText("<br>");
				} else {
					div.addText(text);
				}
			} else if (node instanceof HyperLink) {
				HyperLink hyperLink = (HyperLink) node;
				Element link = div.addElement(ElementType.A);
				link.addText(hyperLink.getText());
				link.addAttribute(AttributeType.HREF, hyperLink.getUri()
						.toString());
			}
		}
	}

}
