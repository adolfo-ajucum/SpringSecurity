package com.amac.SpringSecEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Hello World: " + request.getSession().getId();
    }
}
