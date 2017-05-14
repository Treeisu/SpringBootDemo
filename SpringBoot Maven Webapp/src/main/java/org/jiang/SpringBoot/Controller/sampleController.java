package org.jiang.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@EnableAutoConfiguration
public class sampleController {
	@Value(value = "")
	private String cupSzie;
	@RequestMapping("/say")
	@ResponseBody
	public String firstTest(){
		
		return "Hello World!!!  This is SpringBoot~";		
	}
}
