/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.corespring.springcore.applicationcontextxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Erick
 */
public class applicationContextApp {
    
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
              carro car = (carro)context.getBean("car");
        System.out.println(car.hashCode());
        carro caro = context.getBean(carro.class);
        System.out.println(caro.hashCode());
        
        System.out.println(context);
       
  
    }
}}
