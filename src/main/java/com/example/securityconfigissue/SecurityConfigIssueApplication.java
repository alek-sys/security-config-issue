package com.example.securityconfigissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class IndexController {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class})
public class SecurityConfigIssueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityConfigIssueApplication.class, args);
    }
}
