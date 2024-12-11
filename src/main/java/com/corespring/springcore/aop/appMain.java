/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Erick
 */
public class appMain {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Config.class)){
        carro car = context.getBean(carro.class);
        car.acelerar();
        
        }
    }
 
}
