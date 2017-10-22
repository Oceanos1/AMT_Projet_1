/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.model;

import java.util.Random;

/**
 * @author Michael Spierer
 * @author Edward Ransome
 */
public enum Language {
    CPP("C++"),
    JAVASCRIPT("Javascript"),
    JAVA("Java"),
    C("C"),
    COBOL("COBOL"),
    PHP("PHP");

    
    private final String name;
    private static final Language[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();
    
    private Language(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
    
    public static Language getRandom() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    
}
