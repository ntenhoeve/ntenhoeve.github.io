package nth.github.page.generator.model.text;

import java.net.URI;

public class HyperLink extends Node {

	private final String text;
	private final URI uri;

	public HyperLink(String text, URI uri) {
		this.text = text;
		this.uri = uri;
	}

	public String getText() {
		return text;
	}

	public URI getUri() {
		return uri;
	}
	
	

}
