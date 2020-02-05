package com.learning.wordDirectory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learning.wordDirectory.model.WordMeaning;
import com.learning.wordDirectory.service.MeaningService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MeaningServiceImpl implements MeaningService{

	@Autowired
	private RestTemplate rt;
	
	@Override
	@HystrixCommand(defaultFallback = "meaningDefault",
			threadPoolKey = "meaningDefaultKey" ,
			threadPoolProperties = {
					@HystrixProperty(name = "coreSize" , value = "20"),
					@HystrixProperty(name = "maxQueueSize" , value = "10")
			},
			commandProperties = {
					@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" , value = "2000"),
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")
			}
		)
	public WordMeaning getMeaning() {
		return rt.getForObject("http://word-translator/api/getMeaning?word=34", WordMeaning.class);
	}
	
	private WordMeaning meaningDefault () {
		String[] meaning = {"nothing"};
		return new WordMeaning(0, "nothing", meaning, null);
	}

}
