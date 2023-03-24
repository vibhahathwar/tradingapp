package com.signal.trading;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.signal.trading.controller.TradingController;
import com.signal.trading.service.SignalServiceImpl;

@WebMvcTest(controllers = TradingController.class)
class TradingApplicationTests {
	
	@MockBean
	private SignalServiceImpl signalServiceTest;

	@Autowired
	MockMvc mockMvc;
	
	
	@Test
	void testsignal() {
		
	/*	int signalTest = 2;
		
		doNothing().when(signalServiceTest).handleSignal(signalTest);
		verify(signalServiceTest,times(1)).handleSignal(signalTest); */
		
	}

}
