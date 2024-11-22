package com.spring.Webapp;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


//which transfer the data not the template - RestController
@RestController // Spring doesnt know that it is an controller class inorder to notify the spring we use controller
public class HController {
	
	
	// in a web page we have multiple classes inorder to set the class a homepage we need Rquestmapping
	@RequestMapping("/") // the "/" represent home page 
	//@ResponseBody // which is like im looking for the data not for the page
	public String well() {
		return "Wellcome to our webpage";
	}
	
	@RequestMapping("/About")
	public String About() {
		return "Fun pandrom!!!";
	}
}
