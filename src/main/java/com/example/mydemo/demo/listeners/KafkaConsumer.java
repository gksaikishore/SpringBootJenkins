package com.example.mydemo.demo.listeners;

import com.example.mydemo.demo.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
/*
    @KafkaListener(topics = "Kafka_Example", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void myconsume(User user) {
            System.out.println("Consumed JSON: " + user);
    }

    @KafkaListener(topics = "Kafka_Sample", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void consume(String message) {
        System.out.println("Consumed string: " + message);
    }
*/
}
