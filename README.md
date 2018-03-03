# coremi
Microservices for Operational Risk Framework and Support

Below instructions are copied directly from  https://spring.io/guides/gs/multi-module/

## Test the application
Test the end-to-end result by starting the application. You can start the application in your IDE quite easily, or follow the instructions below to use the command line. Visit the client app in the browser, http://localhost:8080/. There, you should see the String Hello World reflected in the response.

### Maven Command Line to Run Application

Build the library first and then run the application. From the top level:

```
$ ./mvnw install && ./mvnw spring-boot:run -pl application
```
