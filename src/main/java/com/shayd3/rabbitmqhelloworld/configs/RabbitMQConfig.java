package com.shayd3.rabbitmqhelloworld.configs;

import com.shayd3.rabbitmqhelloworld.receivers.HelloWorldReceiver;
import com.shayd3.rabbitmqhelloworld.senders.HelloWorldSender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"RabbitMQConfig", "hello-world"})
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public HelloWorldReceiver receiver() {
        return new HelloWorldReceiver();
    }

    @Profile("sender")
    @Bean
    public HelloWorldSender sender() {
        return new HelloWorldSender();
    }
}
