package com.prototype.model;

import com.prototype.contract.CreatePrototype;

public class Album implements CreatePrototype{
    
    private String name = null;

    @Override
    public Album clone() throws CloneNotSupportedException{
        System.out.println("Clonando Projeto do Album...");
        return (Album) super.clone();
    }

    @Override
    public String toString(){
        return "Metallica - The black Album";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}