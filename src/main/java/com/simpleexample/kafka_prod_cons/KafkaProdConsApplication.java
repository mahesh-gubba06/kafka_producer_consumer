package com.simpleexample.kafka_prod_cons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kafka consumer and producer
 * @author mgubba
 *
 */
@SpringBootApplication
public class KafkaProdConsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProdConsApplication.class, args);
    }

}
