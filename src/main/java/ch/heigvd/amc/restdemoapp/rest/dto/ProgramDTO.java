/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.rest.dto;

import ch.heigvd.amc.restdemoapp.model.Language;
import ch.heigvd.amc.restdemoapp.model.ProgramType;

/**
 *
 * @author Eddie
 */
public class ProgramDTO {

    private ProgramType programType;
    private Language language;
    private double version;
    
       
    public ProgramDTO(ProgramType programType, Language language, double version){
        this.programType = programType;
        this.language = language;
        this.version = version;
    }
    
    public ProgramDTO(){
        
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
    
    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setVersion(double version) {
        this.version = version;
    }   

    
}
