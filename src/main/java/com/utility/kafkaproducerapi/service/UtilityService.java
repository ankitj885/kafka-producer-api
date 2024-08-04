package com.utility.kafkaproducerapi.service;

import com.utility.kafkaproducerapi.producer.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    @Autowired
    private EventProducer eventProducer;

    public void publishEvent(){
        eventProducer.sendToTopic();
    }
}
