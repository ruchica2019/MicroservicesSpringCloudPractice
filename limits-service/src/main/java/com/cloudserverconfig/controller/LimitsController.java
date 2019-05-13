package com.cloudserverconfig.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudserverconfig.util.Configuration;
import com.cloudserverconfig.util.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimitProperties(){
		return new LimitsConfiguration(configuration.getLowerLimit(), configuration.getHigherLimit());
	}
}
