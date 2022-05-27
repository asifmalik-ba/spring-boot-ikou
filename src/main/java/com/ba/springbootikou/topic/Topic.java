package com.ba.springbootikou.topic;

public class Topic {
    
    private String topicCode;
    private String topicName;
    private String topicDescription;


    public Topic(String topicCode, String topicName, String topicDescription) {
        this.topicCode = topicCode;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public String getTopicCode() {
        return topicCode;
    }

    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
    
}
