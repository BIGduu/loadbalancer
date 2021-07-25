package com.example.loadbalancer;

import com.example.loadbalancer.api.TestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@Slf4j
@EnableFeignClients
public class LoadbalancerApplication implements CommandLineRunner {
    @Autowired
    private TestApi testApi;

    public static void main(String[] args) {
        SpringApplication.run(LoadbalancerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final var test = testApi.test();
        log.info(test);
    }
}