# tradingapp

Trading Application is a Spring Boot Application. The application take signal as an integer and perform task as per provided details.

The application has HTTP GET request with @RequestParam 'signal'. signal must be positive non-negative integer. 

The HTTP request as show below :
http://localhost:8080/trade?signal=1

If the value of the signal is 0 or negative the application throws error.

The SignalServiceImpl is a service class which implement HandleSignal method. The method calls algo methods based on signal int value provided.

Integration test is yet to finish.




