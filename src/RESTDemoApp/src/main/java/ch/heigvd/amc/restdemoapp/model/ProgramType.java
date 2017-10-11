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
public enum ProgramType {
    WEBAPP("Web Application"),
    APPLICATION("Applicatoin"),
    APPLET("Applet"),
    GUI("Graphical User Interface"),
    SERVER("Server"),
    SCRIPT("Script");
    
    private final String name;
    
    private ProgramType(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
    
}
