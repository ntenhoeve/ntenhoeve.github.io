package nth.introspect.github.page.generator.element;

import java.util.List;

public class Html5Element extends Element {

	public Html5Element() {
		super(ElementType.SPECIAL_HTML5);
	}

	@Override
	public List<String> print() {
		List<String> lines=super.print();
		//add special line at the top to indicate this document is to be interpreted as HTML5
		lines.add(0,"<!DOCTYPE html>");
		return lines;
	}

}
