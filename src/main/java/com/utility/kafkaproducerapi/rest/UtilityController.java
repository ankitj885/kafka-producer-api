package com.utility.kafkaproducerapi.rest;

import com.utility.kafkaproducerapi.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilityController {

    @Autowired
    private UtilityService utilityService;

    @PostMapping("/publish-event")
    public ResponseEntity<String> publish(@RequestBody String Key, @RequestBody String topic, @RequestBody Object value){
        utilityService.publishEvent();
        return new ResponseEntity<>("TODO", HttpStatus.OK);
    }
}
