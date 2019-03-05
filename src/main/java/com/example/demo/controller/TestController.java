package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.inter.StreamClient;

@RestController
public class TestController {
	@Autowired
    private StreamClient streamClient;
	
	@RequestMapping("/send")
	 public void send() {
		
	   streamClient.output().send(MessageBuilder.withPayload("Hello World...").build());
	 }
	
}
