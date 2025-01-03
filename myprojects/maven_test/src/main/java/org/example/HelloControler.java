package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloControler {
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
