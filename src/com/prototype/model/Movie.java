package com.prototype.model;

import com.prototype.contract.CreatePrototype;

public class Movie implements CreatePrototype {
    private String name = null;
    
    @Override
    public Movie clone() throws CloneNotSupportedException{
        System.out.println("Clonando Projeto do Filme...");
        return (Movie)super.clone();
    }

    @Override
    public String toString(){
        return "TeneT";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}