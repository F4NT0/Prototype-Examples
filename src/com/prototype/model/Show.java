package com.prototype.model;

import com.prototype.contract.CreatePrototype;

public class Show implements CreatePrototype{
    
    private String name = null;

    @Override
    public Show clone() throws CloneNotSupportedException{
        System.out.println("Clonando Projeto Show...");
        return (Show) super.clone();
    }

    @Override
    public String toString(){
        return "AC/DC - Thunderstruck Live";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}