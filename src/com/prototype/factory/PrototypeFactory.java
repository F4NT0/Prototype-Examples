package com.prototype.factory;

import com.prototype.contract.*;
import com.prototype.model.*;

public class PrototypeFactory {
    
    public static class ModelType{
        public static final String movie = "Movie";
        public static final String album = "Album";
        public static final String show = "Show";
    }

    private static java.util.Map<String, CreatePrototype> prototypes = new java.util.HashMap<String, CreatePrototype>();

    static{
        prototypes.put(ModelType.movie, new Movie());
        prototypes.put(ModelType.album, new Album());
        prototypes.put(ModelType.show, new Show());
    }

    public static CreatePrototype getInstance(final String s) throws CloneNotSupportedException{
        return ((CreatePrototype) prototypes.get(s)).clone();
    }
}