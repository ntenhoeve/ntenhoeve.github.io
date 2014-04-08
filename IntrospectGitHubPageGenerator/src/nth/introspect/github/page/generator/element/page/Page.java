package nth.introspect.github.page.generator.element.page;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import nth.introspect.github.page.generator.element.Element;

public abstract class Page {

	public abstract File getFile();
	public abstract Element getElement();
	
	public void createPageFile() {
		File file = getFile();
		String html = "<!DOCTYPE html>\n"+getElement().toString();
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(html);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
