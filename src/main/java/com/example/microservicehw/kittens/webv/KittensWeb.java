package com.example.microservicehw.kittens.webv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensWeb {
	@Value("${kittenApiUrl:default.kittens.url}")
	private String kittensApiUrl;
	@Value("${kittenApiKey:111111}")
	private String kittensApiKey;
	
	@RequestMapping("/kittens")
	@ResponseBody
	KittensWebResult kittens() {
		KittensWebResult kwrst = new KittensWebResult();
		kwrst.setId("1");
		kwrst.setName("Steven");
		kwrst.setApiUrl(kittensApiUrl);
		return kwrst;
	}
}
