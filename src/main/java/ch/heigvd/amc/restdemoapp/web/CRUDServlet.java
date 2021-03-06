/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.amc.restdemoapp.web;

import ch.heigvd.amc.restdemoapp.model.Language;
import ch.heigvd.amc.restdemoapp.model.ProgramType;
import ch.heigvd.amc.restdemoapp.services.IProgramManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eddie
 */
@WebServlet(name = "CRUDServlet", urlPatterns = {"/CRUD"})
public class CRUDServlet extends HttpServlet {

    @EJB
    private IProgramManager programManager;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String operation = request.getParameter("operation");

        String idString = request.getParameter("id");
        String typeString = request.getParameter("type");
        String languageString = request.getParameter("language");
        String versionString = request.getParameter("version");

        switch (operation) {
            case "add": {
                if (!versionString.equals("")) {
                    Language language = Language.valueOf(languageString);
                    ProgramType type = ProgramType.valueOf(typeString);
                    double version = Double.parseDouble(versionString);
                    programManager.addProgram(language, type, version);
                }
            }
            break;
            case "update": {
                if (!idString.equals("") && !versionString.equals("")) {
                    int id = Integer.parseInt(idString);
                    Language language = Language.valueOf(languageString);
                    ProgramType type = ProgramType.valueOf(typeString);
                    double version = Double.parseDouble(versionString);
                    programManager.updateProgram(id, language, type, version);
                }

            }
            break;
            case "delete": {

                if (!idString.equals("")) {
                    programManager.removeProgram(Integer.parseInt(idString));
                }
            }
            break;

        }

        response.sendRedirect("/AMT_Programs/home");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
