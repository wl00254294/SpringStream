package com.example.demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.example.demo.inter.StreamClient;

@Component
@EnableBinding(value = {StreamClient.class})
public class StreamReceiver {
	  private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);
	  
	    @StreamListener(StreamClient.INPUT)
	    public void receive(String message) {
	        logger.info("StreamReceiver: {}", message);
	        System.out.println(message);
	    }
}
