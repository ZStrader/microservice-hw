package com.example.microservicehw.kittens.webv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensWeb {
	@RequestMapping("/kittens")
	@ResponseBody
	KittensWebResult kittens() {
		KittensWebResult kwrst = new KittensWebResult();
		kwrst.setId("1");
		kwrst.setName("Steven");
		return kwrst;
	}
}
