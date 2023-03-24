package com.signal.trading.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.signal.trading.algolibrary.Algo;
import com.signal.trading.algolibrary.SignalHandler;

@Service
public class SignalServiceImpl implements SignalHandler{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SignalServiceImpl.class);
	
	Algo algo = new Algo();
	

	@Override
	public void handleSignal(int signal) {
		
		LOGGER.info("handle signal method to check signal and perform actions");
		//switch statement to check each signal and perform action
		switch(signal) {
			//for signal 1 task to be performed
			case 1: 
				algo.setUp();
				algo.setAlgoParam(1, 60);
				algo.performCalc();
				algo.submitToMarket();
				break;
			//for signal 2 task to be performed
			case 2 :
				algo.reverse();
				algo.setAlgoParam(1,80);
				algo.submitToMarket();
				break;
			//for signal 3 task to be performed
			case 3:
				algo.setAlgoParam(1,90);
				algo.setAlgoParam(2,15);
				algo.performCalc();
				algo.submitToMarket();
				break;
			//if signal is not provided
			default:
				algo.cancelTrades();
				break;
		}
		algo.doAlgo();
		
		
	}
	
	

}
