package com.techstack.message;

import lombok.RequiredArgsConstructor;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GreetingsController {

    // Use MessageSource
    private final MessageSource source;

    @GetMapping("/greet")
    public Greeting createGreeting(@RequestParam String message) {

        Greeting greeting=new Greeting(message);
        System.err.println("Sending greeting!! ");

        // call the channel and send a message
        source.helloOutChannel().send(MessageBuilder.withPayload(greeting).build());

        return greeting;

    }


}
