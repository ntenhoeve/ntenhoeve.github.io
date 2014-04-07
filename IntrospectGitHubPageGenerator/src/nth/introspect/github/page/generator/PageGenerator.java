package nth.introspect.github.page.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public abstract class PageGenerator {

	public abstract File getFile();
	public abstract StringBuilder getHtml();
	
	public void createPageFile() {
		File file = getFile();
		StringBuilder html = getHtml();
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(html.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
