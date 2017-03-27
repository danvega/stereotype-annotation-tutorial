package com.therealdanvega.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAspect {

    private static final Logger logger = Logger.getLogger(ControllerAspect.class);

    @Pointcut("@target(org.springframework.web.bind.annotation.RestController)")
    public void targetRestControllers(){}

    @Before("within(com.therealdanvega.controller..*) && targetRestControllers()")
    private void before(JoinPoint joinPoint){
        String caller = joinPoint.getSignature().toShortString();
        logger.info(caller + " method called.");
    }

}
