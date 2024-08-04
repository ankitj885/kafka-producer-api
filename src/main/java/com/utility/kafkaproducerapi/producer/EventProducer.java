package com.utility.kafkaproducerapi.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;
    public void sendToTopic(){
        kafkaTemplate.send(null,null);
    }
}
