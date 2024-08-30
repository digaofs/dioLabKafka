package com.rfds.dio.bootcamp.kafkarest.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventRegisterService {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public EventRegisterService(KafkaTemplate<Object, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public <T> void addEvent(String topico, T dados) {
        kafkaTemplate.send(topico, dados);
    }
}
