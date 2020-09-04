/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.UtilisateurDAO;
import entite.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Youssef
 */
public class AdminAddUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            /* recuperer les attributs de l utilisateur a partir du formulaire */
            
          String nomUtilisateur = request.getParameter("nomUtilisateur");
        String motdePassUtilisateur = request.getParameter("motdePassUtilisateur");
         String[] typeUtilisateur = request.getParameterValues("typeUtilisateur");
         
          if ( (!nomUtilisateur.equals("")) && (!motdePassUtilisateur.equals("")) &&  (!typeUtilisateur.equals("")))
        {
         Utilisateur utilisateur = new Utilisateur (nomUtilisateur,motdePassUtilisateur,typeUtilisateur[0]);
            
            UtilisateurDAO.insertUtilisateur(utilisateur);
            
          }
          
          
          List<Utilisateur> listUtilisateurs = UtilisateurDAO.GetAllUsers();
        
            request.setAttribute("Liste", listUtilisateurs);
        
         RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/showAllUsers.jsp");
         rd.forward(request, response);

        }
    }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
