package p.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import p.config.kafka.KafkaProcessor;
import p.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ARepository aRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
