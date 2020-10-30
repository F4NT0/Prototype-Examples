package com.prototype.client;

import com.prototype.factory.PrototypeFactory;
import com.prototype.factory.PrototypeFactory.ModelType;

public class TestPrototype {
    public static void main(String[] args){
        try{
            String prototypeMovie = PrototypeFactory.getInstance(ModelType.movie).toString();
            String prototypeAlbum = PrototypeFactory.getInstance(ModelType.album).toString();
            String prototypeShow = PrototypeFactory.getInstance(ModelType.show).toString();
        
            System.out.println("Filme: " + prototypeMovie);
            System.out.println("Album: " + prototypeAlbum);
            System.out.println("Show: " + prototypeShow);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}