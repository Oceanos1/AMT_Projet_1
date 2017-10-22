/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.services;

import ch.heigvd.amc.restdemoapp.model.Program;

import javax.ejb.Local;
import java.util.List;

/**
 * @author Michael Spierer
 * @author Edward Ransome
 */
@Local
public class ProgramService implements IProgramService{


    @Override
    public Boolean addProgram(Program program) {
        return null;
    }

    @Override
    public Boolean removeProgram(int id) {
        return null;
    }

    @Override
    public Boolean updateProgram(int id, Program program) {
        return null;
    }

    @Override
    public Program getProgram(Integer id) {
        return null;
    }

    @Override
    public List<Program> getPrograms(Integer numberPerPage, Integer pageNumber) {
        return null;
    }

    @Override
    public Integer getTotalPrograms() {
        return null;
    }
}
