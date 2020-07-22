package com.techstack.message;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {

    @StreamListener("helloInChannel")
    public void processGreeting(Greeting greeting) {
        System.err.println("Received Greeting  with message ====> " + greeting.getMessage());

    }
}
