package com.example.microservicehw.kittens.webv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicehw.kittens.logic.KittensLogicManager;

@RestController
public class KittensWeb {
	@Autowired
	@Value("${}KittensApiUrl:")
	private String KittensApiUrl;
	@Value("${}KittensApiKey:")
	private String KittensApiKey;
	@Value("${}KittensApiTag:")
	private String KittensApiTag;
	KittensLogicManager manager;
	@RequestMapping("/car")
	@ResponseBody
	KittensWebResult kittens() {
		KittensWebResult kwrst = new KittensWebResult();
		//ResponseEntity<String> url = manager.obtainApiImageUrl();
		kwrst.setApiUrl(KittensApiUrl);
		return kwrst;
	}
}
