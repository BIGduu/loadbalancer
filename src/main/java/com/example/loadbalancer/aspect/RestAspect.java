package com.example.loadbalancer.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class RestAspect {
    @Pointcut("@annotation(com.example.loadbalancer.RestServer)")
    public void point() {
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        final var name = proceedingJoinPoint.getSignature().getName();
        log.info("{} has been executed", name);
        return null;
    }

}
