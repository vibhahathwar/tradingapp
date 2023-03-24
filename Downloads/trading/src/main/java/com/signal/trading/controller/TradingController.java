package com.signal.trading.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.signal.trading.model.Success;
import com.signal.trading.service.SignalServiceImpl;

import jakarta.validation.constraints.Positive;

@RestController
@Validated
public class TradingController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TradingController.class);
	
	@Autowired
	SignalServiceImpl signalService;
	
	
	@GetMapping("/trade")
	public ResponseEntity<?> signalCheck(@RequestParam("signal") @Positive int signal){
		LOGGER.info("signal check method in Trading controller");
		
		signalService.handleSignal(signal);
		Success success = new Success();
		success.setMessage("signal is successfully processed");
		return  new ResponseEntity<Success>(success, null, HttpStatus.OK);
		
		
	}

}
