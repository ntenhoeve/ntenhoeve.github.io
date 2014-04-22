package nth.github.page.generator.model.pagefactories;

import java.net.URI;
import java.util.List;

import nth.github.page.generator.model.text.TextDocument;

import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHyperlink;
import org.apache.poi.xwpf.usermodel.XWPFHyperlinkRun;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink;

public class TextDocumentFactory {

	/**
	 * @param wordDocument
	 *            a POI model which represents a word file
	 * @return our own model (created from the POI word model)
	 */
	public static TextDocument create(XWPFDocument wordDocument) {
		List<XWPFParagraph> paragraphs = wordDocument.getParagraphs();

		TextDocument textDoc = new TextDocument();

		for (XWPFParagraph paragraph : paragraphs) {

			List<XWPFRun> runs = paragraph.getRuns();

			if (paragraph.getStyle() == null) {
				// see:
				// http://stackoverflow.com/questions/7007810/how-to-create-a-email-link-in-poi-word-format
				for (XWPFRun run : runs) {
					if (run instanceof XWPFHyperlinkRun) {
						XWPFHyperlinkRun hyperlinkRun = (XWPFHyperlinkRun) run;
						String text = hyperlinkRun.getText(0);
						String id = hyperlinkRun.getHyperlinkId();
						URI uri = null;
						if (id != null) {
							PackageRelationship relationship = wordDocument
									.getPackagePart().getRelationship(id);
							uri = relationship.getTargetURI();
						}
						textDoc.addHyperLink(text, uri);
					} else {
						String text = run.getText(0);
						if (text != null && text.contains("TODO")) {
							textDoc.addToDo(text);
						} else {
							textDoc.addText(text);
						}
					}
				}

			} else {
				switch (paragraph.getStyle()) {
				case "Heading1":
					textDoc.addChapterLevel1(paragraph);
					break;
				case "Heading2":
					textDoc.addChapterLevel2(paragraph);
					break;
				case "Heading3":
					textDoc.addChapterLevel3(paragraph);
					break;
				default:
					break;
				}
			}
		}

		return textDoc;

	}

}
