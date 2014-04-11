package nth.introspect.github.page.generator.element.page;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import nth.introspect.github.page.generator.element.Element;
import nth.introspect.github.page.generator.element.Html5Element;

public abstract class Page {

	public abstract File getFile();
	public abstract Element getElement();
	
	public void createPageFile() {
		File file = getFile();
		Html5Element html5=new Html5Element();
		html5.addElement(getElement());
		String html = html5.toString();
		try {
			OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(file),"UTF8");
			//BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(html);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
