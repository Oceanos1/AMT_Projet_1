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
    public Boolean addProgram(Language language, ProgramType type, double version) {
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO program (language, type, version) VALUES (?, ?, ?);");
            
            pstmt.setString(1, language.name());
            pstmt.setString(2, type.name());
            pstmt.setDouble(3, version);
            
            pstmt.executeUpdate();
            connection.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean removeProgram(int id) {
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM program WHERE program.id = ?");
            
            pstmt.setInt(1, id);
            
            pstmt.executeUpdate();
            
            connection.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateProgram(int id, Language language, ProgramType type, double version) {
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("UPDATE program SET language = ?, type = ?, version = ? WHERE program.id = ?");
            
            pstmt.setString(1, language.name());
            pstmt.setString(2, type.name());
            pstmt.setDouble(3, version);
            pstmt.setInt(4, id);
            
            pstmt.executeUpdate();
            
            connection.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Program getProgram(int id) {
        Program result = null;
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM program WHERE program.id = ?");
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                result = new Program(
                        rs.getInt("id"),
                        ProgramType.valueOf(rs.getString("type")),
                        Language.valueOf(rs.getString("language")),
                        rs.getDouble("version"));
            }
            
            connection.close();
        }catch(SQLException ex){

        }
        return result;
    }
    
    public List<Program> findAllPrograms() {
        List<Program> programs = new ArrayList<>();
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM program");
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
    public boolean generateRandomPrograms(int n){
        try{
            Connection connection = dataSource.getConnection();

            for (int i = 0; i < n; i++) {
                PreparedStatement pstmt = connection.prepareStatement("INSERT INTO program (language, type, version) VALUES (?, ?, ?);");
                pstmt.setString(1, Language.getRandom().name());
                pstmt.setString(2, ProgramType.getRandom().name());
                pstmt.setDouble(3, 1);
                pstmt.executeUpdate();
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    @Override
    public Integer getTotalPrograms() {
        return null;
    }

}
