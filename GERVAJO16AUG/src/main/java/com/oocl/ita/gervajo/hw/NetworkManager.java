package com.oocl.ita.gervajo.hw;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkManager {
	
	private String link;
	private URL httpUrl;
	private URLConnection urlConn;
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public URL getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String link) throws MalformedURLException {
		this.httpUrl = new URL(link);
	}
	
	private void setUrlConn(URL httpUrl) throws IOException{
		this.urlConn = httpUrl.openConnection();
	}


	public void init(URLConnection urlConn) throws IOException {
		System.out.println("Bean is going through initialization...");
		urlConn.connect();

	}

	public void destroy(URLConnection urlConn) {
		System.out.println("Bean will be destroyed now.");
	}

}
