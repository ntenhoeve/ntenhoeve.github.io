package nth.github.page.generator;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import nth.github.page.generator.model.html.element.page.Page;
import nth.github.page.generator.model.html.element.page.PageFactory;
import nth.github.page.generator.model.pagefactories.HtmlSmallPageFactory;
import nth.github.page.generator.model.pagefactories.StringDocumentFactory;
import nth.github.page.generator.model.pagefactories.TextDocumentFactory;
import nth.github.page.generator.model.text.TextDocument;


public class GitHubPageService {

	public void createPages(GitHubPageGeneratorConfig config){
		clearHtmlFolder(config);
		
		createHtmlFiles(config);
	}

	private void createHtmlFiles(GitHubPageGeneratorConfig config) {
		try {
			//TODO move file to config
			File file = new File(
					"C:/Users/nilsth/My Git/ntenhoeve.github.io/IntrospectGitHubPageGenerator/background doc/Introspect Manual.docx");
			FileInputStream fis = new FileInputStream(file);

			XWPFDocument wordDocument = new XWPFDocument(fis);

			//create our own model from the POI word model
			TextDocument textDocument=TextDocumentFactory.create(wordDocument);

			HtmlSmallPageFactory.createFiles(config, textDocument);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		
	}

	private void clearHtmlFolder(GitHubPageGeneratorConfig config) {
		File htmlFolder = config.getHtmlFileDestination();
		File[] files = htmlFolder.listFiles();
		for (File file : files) {
			file.delete();
		}
	}
}
