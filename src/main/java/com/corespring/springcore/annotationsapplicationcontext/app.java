/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.annotationsapplicationcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Erick
 */
public class app {
    public static void main(String[] args) {
         try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(contextConfig.class)){
                            Carro car = context.getBean(Carro.class);
                          car.setModelo("toyota");
                            System.out.println(car.getModelo());
        }
       
   
    }
    
}
