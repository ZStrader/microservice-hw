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
	
	KittensLogicManager manager;
	@RequestMapping("/car")
	@ResponseBody
	ResponseEntity<String> kittens() {
		//KittensWebResult kwrst = new KittensWebResult();
		ResponseEntity<String> url = manager.obtainApiImageUrl();
		//kwrst.setApiUrl(KittensApiUrl);
		return url;
	}
}
