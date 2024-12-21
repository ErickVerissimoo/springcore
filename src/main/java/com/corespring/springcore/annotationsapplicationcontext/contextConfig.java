/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Configuration.java to edit this template
 */
package com.corespring.springcore.annotationsapplicationcontext;

import com.corespring.springcore.applicationcontextxml.moto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Erick
 */
@Configuration
@ComponentScan(basePackages = "com.corespring.springcore.annotationsapplicationcontext")
public class contextConfig {
    @Bean
    @Scope(value = "singleton")
    public moto getMoto(){
        moto mot = new moto();
        mot.setCilindradas(2);
        mot.setModelo("Honda");
        return mot;
    }
}
