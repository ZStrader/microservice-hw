package com.example.microservicehw.image.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ImageLogicManager {

	@Value("${imageApiUrl:}")
	private String imageApiUrl;
	@Value("${imageApiKey:}")
	private String imageApiKey;
	@Value("${imageApiTags:}")
	private String imageApiTags;
	
	public ResponseEntity<String> obtainApiImageUrl() {
		String apiUrl = imageApiUrl;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
}
