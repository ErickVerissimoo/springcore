/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Component.java to edit this template
 */
package com.corespring.springcore.annotationsapplicationcontext;

import org.springframework.stereotype.Component;

/**
 *
 * @author Erick
 */
@Component
public class pessoa {
    private String nome = "derick";
    private int idade = 18;
    private Carro car;
    public pessoa(Carro car){
        this.car=car;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
