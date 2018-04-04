package com.example.microservicehw.kittens.webv;

public class KittensWebResult {

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
