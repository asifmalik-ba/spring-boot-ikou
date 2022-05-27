package com.ba.springbootikou.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TopicController {
    
    @Autowired
    private TopicService topicService;

    @GetMapping("/topic")
    public List<Topic> getMethodName() {
        return topicService.getAllTopics();
    }
    
}
