package ch.heigvd.amc.restdemoapp.services;
import ch.heigvd.amc.restdemoapp.model.Program;
import java.util.List;

/**
 * @author Michael Spierer
 * @author Edward Ransome
 */
public interface IProgramService {

    /**
     * add a program to the database
     * @param program the program to add to the database
     * @return true if the program is correctly added to the database
     */
    Boolean addProgram(Program program);

    /**
     * remove a program from the database
     * @param id the id of the program to remove
     * @return true if the program is correctly removed
     */
    Boolean removeProgram(int id);

    /**
     * update a program from the database
     * @param id the id of the program to update
     * @param program the new program to update
     * @return true if the program is correctly updated
     */
    Boolean updateProgram(int id, Program program);

    /**
     * Return a specific program
     * @param id the id of a specific program
     * @return the specific program
     */
    Program getProgram(Integer id);

    /**
     *
     * @param numberPerPage
     * @param pageNumber
     * @return
     */
    List<Program> getPrograms(Integer numberPerPage, Integer pageNumber);

    /**
     * @return the total of programs in the database
     */
    Integer getTotalPrograms();



}
