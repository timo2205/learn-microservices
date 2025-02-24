package com.timothy.restaurant.controller;

import com.timothy.restaurant.kafka.dto.Event;
import com.timothy.restaurant.kafka.producer.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/test-kafka")
public class TestKafkaController {

    private final KafkaProducerService kafkaProducerService;

    public TestKafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestBody Event event){
        kafkaProducerService.sendMessage("TEST_KAFKA",event);
        return "success";
    }

}
