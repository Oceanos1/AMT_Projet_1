/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.rest;

import ch.heigvd.amc.restdemoapp.model.Program;
import ch.heigvd.amc.restdemoapp.rest.dto.ProgramDTO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Eddie
 */
@Stateless
@Path("/programs")
public class ProgramResource {
    @EJB
    InMemoryDataStoreLocal inMemoryDataStore;
    
    @Context
    UriInfo uriInfo;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProgramDTO> getPrograms(@QueryParam = 'byName') String byName {
        List<Program> programs = inMemoryDataStore.findAllPrograms();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createProgram(ProgramDTO programDTO){
        Program program = fromDTO(programDTO);
    }

    public Program fromDTO(ProgramDTO programDTO) {
        return new Program(
                programDTO.getProgramType(),
                programDTO.getLanguage(),
                programDTO.getVersion());
    }
    
    public ProgramDTO toDTO(Program program){
        return new ProgramDTO(
                program.getProgramType(),
                program.getLanguage(),
                program.getVersion());
    }
    
    
}
