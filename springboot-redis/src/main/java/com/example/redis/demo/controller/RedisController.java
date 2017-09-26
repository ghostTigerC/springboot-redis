package com.example.redis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.demo.RedisUtils;

@RestController
public class RedisController {

	@Autowired  
    private RedisUtils utils;
	
    @RequestMapping("/set")
    public String set(String key,String value) {
    	
    	boolean b = utils.set(key, value);
    	return String.valueOf(b);
    }
    
    @RequestMapping("/get")
    public String get(String key) {
    	return (String) utils.get(key);
    }
}
