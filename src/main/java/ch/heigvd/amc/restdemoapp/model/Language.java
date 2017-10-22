/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.model;

/**
 *
 * @author Eddie
 */
public enum Language {
    CPP("C++"),
    JAVASCRIPT("Javascript"),
    JAVA("Java"),
    C("C"),
    COBOL("COBOL"),
    PHP("PHP");
    
    private final String name;
    
    private Language(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
    
}
