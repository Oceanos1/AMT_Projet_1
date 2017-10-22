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
    private Integer id;
    private ProgramType programType;
    private Language language;
    private double version;
    
    public Program(ProgramType programType, Language language, double version){
        this.programType = programType;
        this.language = language;
        this.version = version;
    }

    public Program(Integer id,ProgramType programType, Language language, double version){
        this(programType,language,version);
        this.id = id;
    }

    public Integer getId(){ return id; }

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
