package io.builders.amqp.poc.consumer

import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter
import org.springframework.stereotype.Component

@Component
class Processor extends MessageListenerAdapter{

    Processor() {
        super()
        setDefaultListenerMethod("receive")
    }

    void receive(String message){
        println "Message payload: " + message
    }
}
