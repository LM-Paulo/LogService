package br.com.cendrethecoffeee.LogService.consumers;

import br.com.cendrethecoffeee.LogService.dto.LogDto;
import br.com.cendrethecoffeee.LogService.service.LogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class LogConsumer {

    @Autowired
    LogService logService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload LogDto logDto){
        logService.registerTransaction(logDto);

    }
}
