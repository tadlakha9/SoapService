package com.consumerCompany.demo.consumer_testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producercompany.demo.producingsoapmessage.ViewerService;

import org.springframework.web.bind.annotation.PathVariable;

//import com.producercompany.demo.producingsoapmessage.ViewerService;

@RestController
public class Test {
	
	@Autowired
	ViewerService viewerService;
	
	@GetMapping("/receiver/{documentId}")
	public void receiver(@PathVariable String documentId) {
		System.out.println("documentId:"+documentId);
		System.out.println("response:"+viewerService.getRelease(documentId));
	}

}
