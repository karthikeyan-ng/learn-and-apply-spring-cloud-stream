package com.techstack.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageSource {

    //Configure a Channel with name "helloOutChannel"
    //This is just a declarative style to define an Out channel.
    //However, actual implementation/communication will happen based on application.yml | .yml

    @Output("helloOutChannel")
    MessageChannel helloOutChannel();
}
