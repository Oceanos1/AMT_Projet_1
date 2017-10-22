/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.services;

import ch.heigvd.amc.restdemoapp.model.Language;
import ch.heigvd.amc.restdemoapp.model.Program;
import ch.heigvd.amc.restdemoapp.model.ProgramType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author Eddie
 */
@Stateless
public class ProgramManager implements IProgramManager{
    
    @Resource(lookup = "java:/jdbc/amt_programs")
    private DataSource dataSource;

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

    public List<Program> findAllPrograms(Integer numberPerPage, Integer pageNumber) {
        List<Program> programs = new ArrayList<>();
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM program LIMIT ? OFFSET ?");
            pstmt.setInt(1, numberPerPage);
            pstmt.setInt(2, pageNumber*numberPerPage);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                programs.add(new Program(
                        rs.getInt("id"),
                        ProgramType.valueOf(rs.getString("type")),
                        Language.valueOf(rs.getString("language")),
                        rs.getDouble("version")));
            }
            connection.close();
        }catch(SQLException ex){

        }
        return programs;
    }

    @Override
    public Integer getTotalPrograms() {
        return null;
    }

}
