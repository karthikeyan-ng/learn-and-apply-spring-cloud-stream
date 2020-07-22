package com.techstack.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageSource {

    //Configure a Channel with name "helloInChannel" which will receive a message from a exchange
    //This is just a declarative style to define an Out channel.
    //However, actual implementation/communication will happen based on application.yml | .yml

    @Input("helloInChannel")
    SubscribableChannel helloInChannel();
}
