package com.example.microservicehw.image.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicehw.image.logic.ImageLogicManager;

@RestController
public class ImageWeb {
	
	@Autowired
	ImageLogicManager manager;
	@RequestMapping("/car")
	@ResponseBody
	ResponseEntity<String> image() {
		//KittensWebResult kwrst = new KittensWebResult();
		ResponseEntity<String> url = manager.obtainApiImageUrl();
		//kwrst.setApiUrl(KittensApiUrl);
		return url;
	}
}
