package nth.github.page.generator.model.pagefactories;

import java.util.ArrayList;
import java.util.List;

import nth.github.page.generator.model.text.ChapterLevel1;
import nth.github.page.generator.model.text.HyperLink;
import nth.github.page.generator.model.text.Node;
import nth.github.page.generator.model.text.NodeContainer;
import nth.github.page.generator.model.text.Text;
import nth.github.page.generator.model.text.ToDo;

public class StringDocumentFactory {

	private static final String INDENT = " ";
	private static final String NEW_LINE = "\n";

	public static String create(Node node) {
		List<String> lines = print(node);
		StringBuilder builder = new StringBuilder();
		for (String line : lines) {
			builder.append(line);
			builder.append(NEW_LINE);
		}
		return builder.toString();
	}

	private static List<String> print(Node node) {
		List<String> lines = new ArrayList<>();

		StringBuilder line = new StringBuilder();
		line.append(node.getClass().getSimpleName());
		line.append("(");

		if (node instanceof ChapterLevel1) {
			ChapterLevel1 chapter = (ChapterLevel1) node;
			line.append("title=");
			line.append(chapter.getTitle());
		} else if (node instanceof Text) {
			Text text = (Text) node;
			line.append("text=");
			line.append(text.getText());
		}else if (node instanceof HyperLink) {
			HyperLink hyperLink= (HyperLink) node;
			line.append("text=");
			line.append(hyperLink.getText());
			line.append(" uri=");
			line.append(hyperLink.getUri());
		}else if (node instanceof ToDo) {
			ToDo toDo = (ToDo) node;
			line.append("text=");
			line.append(toDo.getText());
		}
		
		
		// add children if any
		if (node instanceof NodeContainer && ((NodeContainer)node).getChilderen().size()>0) {
			lines.add(line.toString());
			NodeContainer nodeContainer = (NodeContainer) node;
			for (Node child : nodeContainer.getChilderen()) {
				// recursive call to print children
				List<String> childLines = print(child);
				for (String childLine : childLines) {
					lines.add(INDENT + childLine);
				}
			}
			//close node
			lines.add(")");
		} else {
			//close node on the same line
			line.append(")");	
			lines.add(line.toString());
		}

		return lines;
	}

}
