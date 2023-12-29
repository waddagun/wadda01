package com.pcm.wadda01.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

//@Slf4j
@Component
public class Consumer {
	private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	// hello 큐의 메시지가 컨슘되는지 확인하기위해 로그 추가
    @RabbitListener(queues = "hello")
    public void consume(Message message){
        log.info("consumer consumes message: {}",message);
    }

    
}
