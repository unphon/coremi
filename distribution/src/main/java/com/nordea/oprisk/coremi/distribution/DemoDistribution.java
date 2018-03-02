package com.nordea.oprisk.coremi.distibution;

import com.nordea.oprisk.coremi.email.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "coremi")
@RestController
public class DemoDistribution {

    private final MyService myService;

    public DemoDistribution(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoDistribution.class, args);
    }
}