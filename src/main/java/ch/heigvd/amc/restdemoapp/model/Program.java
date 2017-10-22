/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.model;

/**
 * @author Michael Spierer
 * @author Edward Ransome
 */
public class Program {
    private final ProgramType programType;
    private final Language language;
    private final double version;
    
    public Program(ProgramType programType, Language language, double version){
        this.programType = programType;
        this.language = language;
        this.version = version;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public Language getLanguage() {
        return language;
    }

    public double getVersion() {
        return version;
    }
    
    
    
    
}
