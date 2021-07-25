package com.example.loadbalancer.api;

import com.example.loadbalancer.RestServer;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
public interface TestApi {
    String test();
}
