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
public enum ProgramType {
    WEBAPP("Web Application"),
    APPLICATION("Application"),
    APPLET("Applet"),
    GUI("Graphical User Interface"),
    SERVER("Server"),
    SCRIPT("Script");

    
    
    private final String name;
    private static final ProgramType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();
    
    private ProgramType(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
    
    public static ProgramType getRandom() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    
}
