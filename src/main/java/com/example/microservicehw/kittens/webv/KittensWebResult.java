package com.example.microservicehw.kittens.webv;

public class KittensWebResult {
	private String id;
	private String name;
	private String apiUrl;
	
	public String getId() {
		return id;
	}
	
	public void setId(String i) {
		id =i;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String i) {
		name = i;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
}
