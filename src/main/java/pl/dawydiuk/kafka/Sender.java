package pl.dawydiuk.kafka;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Sender {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.ddoo}")
    private String topic;

    public void send(String message) {
        log.info("sending message='{}' to tosfsdfspic='{}'", message, topic);
        kafkaTemplate.send(topic, message);
    }

    public void send22(String message) {
        log.info("sending message='{}' to topic='{}'", message, topic);
        kafkaTemplate.send(topic, message);
    }
}
