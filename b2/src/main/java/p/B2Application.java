package p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;
import p.config.kafka.KafkaProcessor;

@SpringBootApplication
@EnableBinding(KafkaProcessor.class)
@EnableFeignClients
public class B2Application {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(B2Application.class, args);
    }
}
