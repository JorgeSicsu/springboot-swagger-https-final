package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/status")
  public String status() {
    return "API OK";
  }

  @GetMapping("/api/hello")
  public String hello() {
    return "Hello from Railway HTTPS!";
  }
}