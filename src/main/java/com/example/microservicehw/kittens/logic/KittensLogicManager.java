package com.example.microservicehw.kittens.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KittensLogicManager {
	
	@Value("${KittenApiUrl:https://jsonplaceholder.typicode.com/users}")
	private String KittenApiUrl;
	@Value("${KittenApikey:}")
	private String KittenApikey;
	@Value("${KittenApiTags:}")
	private String KittenApiTags;
	
	public ResponseEntity<String> obtainApiImageUrl() {
		String apiUrl = KittenApiUrl + KittenApikey + KittenApiTags;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
}
