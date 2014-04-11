package nth.introspect.github.page.generator.httpclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpClient {

	public static String read(URL url) {
		StringBuilder html = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream(),"UTF-8" ));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				html.append(inputLine);
				html.append("/n");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return html.toString();
	}

}
