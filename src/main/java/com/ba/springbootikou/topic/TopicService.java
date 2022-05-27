package com.ba.springbootikou.topic;

import java.util.Arrays;


import java.util.List;

import org.springframework.stereotype.Service;

//16:16
@Service
public class TopicService {
    
    private List<Topic> topics = Arrays.asList(
        new Topic("java-01", "Java Introduction", "Hands-on JavaScript to learn from scratch."),
        new Topic("spring-01", "Spring Boot Course", "Spring Boot for beginners."),
        new Topic("js-01", "Basic JavaScript", "Basic JavaScript course for Students.")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

}
