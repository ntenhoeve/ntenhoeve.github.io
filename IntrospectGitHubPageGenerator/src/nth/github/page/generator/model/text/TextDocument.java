package nth.github.page.generator.model.text;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class TextDocument extends NodeContainer {

	private NodeContainer currentNodeContainer;
	private ChapterLevel1 currentChapterLevel1;
	private ChapterLevel2 currentChapterLevel2;
	private ChapterLevel3 currentChapterLevel3;

	public void addChapterLevel1(XWPFParagraph paragraph) {
		ChapterLevel1 chapterLevel1 = new ChapterLevel1(paragraph);
		// chapters are added to the root node
		getChilderen().add(chapterLevel1);
		currentNodeContainer = chapterLevel1;
		currentChapterLevel1 = chapterLevel1;

	}

	public void addChapterLevel2(XWPFParagraph paragraph) {
		ChapterLevel2 chapterLevel2 = new ChapterLevel2(paragraph);
		// add node to currentChapterLevel1
		currentChapterLevel1.getChilderen().add(chapterLevel2);
		currentNodeContainer = chapterLevel2;
		currentChapterLevel2 = chapterLevel2;
	}

	public void addChapterLevel3(XWPFParagraph paragraph) {
		ChapterLevel3 chapterLevel3 = new ChapterLevel3(paragraph);
		// add node to currentChapterLevel2
		currentChapterLevel2.getChilderen().add(chapterLevel3);
		currentNodeContainer = chapterLevel3;
		currentChapterLevel3 = chapterLevel3;
	}

	public void addText(String textString) {
		Text text = new Text(textString);
		// only add text to a chapter
		if (currentNodeContainer != null) {
			currentNodeContainer.getChilderen().add(text);
		}
	}

	public void addHyperLink(String text, URI uri) {
		HyperLink hyperLink=new HyperLink(text, uri);
		// only add text to a chapter
		if (currentNodeContainer != null) {
			currentNodeContainer.getChilderen().add(hyperLink);
		}
	}

	public void addToDo(String text) {
		ToDo toDo=new ToDo(text);
		// only add text to a chapter
		if (currentNodeContainer != null) {
			currentNodeContainer.getChilderen().add(toDo);
		}
	}

	public List<ChapterLevel1> getChapterLevels1() {
		List<ChapterLevel1> chapterLevels1=new ArrayList<>();
		List<Node> children = getChilderen();
		for (Node child : children) {
			if (child instanceof ChapterLevel1) {
				ChapterLevel1 chapterLevel1 = (ChapterLevel1) child;
				chapterLevels1.add(chapterLevel1);
			}
		}
		return chapterLevels1;
	}

}
