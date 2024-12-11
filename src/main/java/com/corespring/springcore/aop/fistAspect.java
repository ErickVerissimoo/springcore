/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 *
 * @author Erick
 */
@Aspect
@Component
public class fistAspect {
   @Before("execution(* com.corespring.springcore.aop.*.*(..))") 
   public void logBeforeMethodExecution(JoinPoint joinPoint) 
   { 
       System.out.println("O método: " 
               + joinPoint.getSignature().toShortString() 
               + " está prestes a ser executado."); 
   }
}
