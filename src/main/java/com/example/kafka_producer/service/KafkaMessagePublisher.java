package com.example.kafka_producer.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> template;

    public void sendMessageToTopic(String message) {
        CompletableFuture<SendResult<String, Object>> future = template.send("newtopic2", message);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println(
                        "Sent message = [" + message + "] with offset = [" + result.getRecordMetadata().offset() + "]"
                                + " on topic = [" + result.getRecordMetadata().topic() + "]" + " on partition = ["
                                + result.getRecordMetadata().partition() + "]");
            } else {
                System.out.println(
                        "Unable to send the message = [" + message + "] due to exception = [" + ex.getMessage() + "]");
            }

        });
    }

}
