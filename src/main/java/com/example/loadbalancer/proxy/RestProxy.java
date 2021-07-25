package com.example.loadbalancer.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class RestProxy<T> implements InvocationHandler {

    private final Class<T> interfaceType;

    public RestProxy(Class<T> interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return "nihao";
    }
}
