/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.beanfacyoryapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Erick
 */
public class app {
    public static void main(String[] args) {
    Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new ClassPathXmlApplicationContext(resource.getFilename());
        
        pessoa p = factory.getBean(pessoa.class);
        System.out.println(p.toString());
            }
 
}
