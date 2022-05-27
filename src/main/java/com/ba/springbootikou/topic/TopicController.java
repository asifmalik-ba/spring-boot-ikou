package com.ba.springbootikou.topic;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TopicController {
    
    @GetMapping("/topic")
    public String getMethodName() {
        return "This is Topic Controller";
    }
    
}
