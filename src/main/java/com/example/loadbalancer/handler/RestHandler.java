package com.example.loadbalancer.handler;

import com.example.loadbalancer.entity.ServerInfo;
import org.springframework.cglib.core.MethodInfo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.Response;

public interface RestHandler<T> {
    T invokeRest(Response<ServiceInstance> instanceResponse, MethodInfo methodInfo);
}
