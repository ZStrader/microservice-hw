package com.example.microservicehw.kittens.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KittensLogicManager {
	
	@Value("${kittensApiUrl:https://jsonplaceholder.typicode.com/users}")
	private String kittensApiUrl;
	@Value("${kittensApikey:}")
	private String kittensApikey;
	@Value("${kittensApiTags:}")
	private String kittensApiTags;
	
	public ResponseEntity<String> obtainApiImageUrl() {
		String apiUrl = kittensApiUrl + kittensApikey + kittensApiTags;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
}
