package com.rfds.dio.bootcamp.kafkarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkarestApplication.class, args);
	}

}
