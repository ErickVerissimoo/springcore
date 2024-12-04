/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.annotationsapplicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Erick
 */
public class app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(contextConfig.class);
        pessoa p = context.getBean(pessoa.class);
        System.out.println(p.getNome());
        p.setCar(context.getBean(Carro.class));
        p.getCar().setAnofabricacao(2020);
        System.out.println(p.getCar().getAnofabricacao());
        
    }
}
