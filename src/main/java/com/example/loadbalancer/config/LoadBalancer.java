package com.example.loadbalancer.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.client.loadbalancer.reactive.ReactiveLoadBalancer;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/*
@Slf4j
public class LoadBalancer {
    @Autowired
    private ObjectMapper objectMapper;

    private ReactiveLoadBalancer.Factory<ServiceInstance> serviceInstanceFactory;

    LoadBalancer(ReactiveLoadBalancer.Factory<ServiceInstance> serviceInstanceFactory) {
        this.serviceInstanceFactory = serviceInstanceFactory;
    }

    public void test() throws JsonProcessingException {
        final var client = serviceInstanceFactory.getInstance("CLIENT");
        final var choose = client.choose();
        Flux.from(choose)
                .subscribe((Response<ServiceInstance> serviceInstanceResponse) -> {

                });

    }

}
*/
