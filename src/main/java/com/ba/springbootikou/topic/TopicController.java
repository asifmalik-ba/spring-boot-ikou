package com.ba.springbootikou.topic;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TopicController {
    
    @GetMapping("/topic")
    public String getMethodName() {
        return "This is Topic Controller";
    }
    
}
