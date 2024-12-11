/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.springcore.annotationsapplicationcontext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Erick
 */
@Component
public class Carro {
private String modelo;
    public String getModelo() {
        return modelo;
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean criada");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean destruida");
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;
    }
private int anofabricacao;
}

