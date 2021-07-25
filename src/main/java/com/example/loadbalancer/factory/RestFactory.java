package com.example.loadbalancer.factory;

import com.example.loadbalancer.proxy.RestProxy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

@AllArgsConstructor
public class RestFactory<T> implements FactoryBean<T> {

    private final Class<T> interfaceType;

    @Override
    public T getObject() throws Exception {
        final var tRestProxy = new RestProxy<T>(interfaceType);
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, tRestProxy);
    }

    @Override
    public Class<?> getObjectType() {
        return this.interfaceType;
    }
}
