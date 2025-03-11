package com.example.kafka_producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic creaNewTopic() {
        System.out.println("New topic created!!");
        return new NewTopic("newtopic2", 5, (short) 1);
    }
}
