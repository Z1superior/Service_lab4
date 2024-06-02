package org.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @RequestMapping("/fallback")
    public void fallback(){
        System.out.println("fallback");
    }

}
