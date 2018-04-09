package com.example.microservicehw.image.web;

public class ImageWebResult {
	private String apiUrl;
	private String OAuthToken;
	
	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getOAuthToken() {
		return OAuthToken;
	}

	public void setOAuthToken(String oAuthToken) {
		OAuthToken = oAuthToken;
	}
}
