package com.l.cloud.Sserver.Sserver.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	 
	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
	  
	      return "hello "+name+"，this is first messge";
	}
	

  

}
