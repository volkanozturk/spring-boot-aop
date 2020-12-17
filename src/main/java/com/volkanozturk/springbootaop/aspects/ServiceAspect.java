package com.volkanozturk.springbootaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author volkanozturk
 */
@Aspect
@Component
public class ServiceAspect {

  @Before("execution(* com.volkanozturk.springbootaop.service.MessageService.getMessage(..))")
  public void beforeGetMessages(JoinPoint joinPoint) {
    System.out.println("Before getMessages: " + joinPoint.getArgs()[0]);
    System.out.println(joinPoint.getSignature());
  }

  @After("execution(* com.volkanozturk.springbootaop.service.*.*(..))")
  public void AfterGetMessages(JoinPoint joinPoint) {
    System.out.println("After getMessages: " + joinPoint.getArgs()[0]);
    System.out.println(joinPoint.getSignature());
  }
}