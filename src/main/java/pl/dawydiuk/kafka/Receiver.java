package pl.dawydiuk.kafka;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Receiver {


    @KafkaListener(topics = "${app.topic.foo}")
    public void listen(@Payload String message) {
        log.info("received message='{}'", message);
     }

}
