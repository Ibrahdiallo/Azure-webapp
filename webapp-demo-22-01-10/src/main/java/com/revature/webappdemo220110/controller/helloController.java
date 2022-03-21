package com.revature.webappdemo220110.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

  @GetMapping("/hello")
  public String hello() {
      return "Hello from Spring Boot App!";
  }

    @GetMapping("/hi")
    public String hi() {
        return "Hi Ibra from Spring Boot App!";
    }
}
