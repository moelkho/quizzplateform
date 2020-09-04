/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entite.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class AuthentificationServlet extends HttpServlet {

    static Session session = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            /* recuperation des informations a partir du formulaire de l'index */
            
            String nom = request.getParameter("name");
            String mdp = request.getParameter("password");
            
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery(" from Utilisateur U where U.utilisateurName= :ClientName ");
      
            query.setParameter("ClientName", nom);
            
        List<Utilisateur> user = query.list();
        
        
        for (Utilisateur u : user)
        { 
            if (u.getUtilisateurName().equals(nom) && u.getMotdepass().equals(mdp) && u.getTypeuser().equals("administrateur"))
            {
                
            request.setAttribute("Users", user);
            RequestDispatcher rd = request.getRequestDispatcher("pageAdministrateur.jsp");
       
        rd.forward(request, response);


            }
            
              if (u.getUtilisateurName().equals(nom) && u.getMotdepass().equals(mdp) && u.getTypeuser().equals("utilisateur"))
            {
                
            request.setAttribute("nom", nom);
            RequestDispatcher rd = request.getRequestDispatcher("UserServlet");
       
        rd.forward(request, response);


            }
              
           if (!u.getUtilisateurName().equals(nom) || !u.getMotdepass().equals(mdp))
              {RequestDispatcher rd = request.getRequestDispatcher("/erreur.jsp");
       
        rd.forward(request, response);
              }
        }

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
