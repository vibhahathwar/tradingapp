# tradingapp

Trading Application is a Spring Boot Application. The application take signal as an integer and perform task as per provided details.

The application has HTTP GET request which with signal is passed as requestparam.

http://localhost:8080/trading?signal=1

If the value of the signal is 0 or negative the application throws error.
