package com.techstack.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Technical Notes:
 * Add @EnableBinding(uses my Binding interface e.g MessageSource.class) will
 * connect to RabbitMQ exchange will be done and an implementation for MessageSource.java
 */

@EnableBinding(MessageSource.class)
@SpringBootApplication
public class MessageConsumerRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageConsumerRabbitmqApplication.class, args);
	}

}
