/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.QuestionDAO;
import DAO.ReponsePossibleDAO;
import entite.Question;
import entite.ReponsePossible;
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
public class AdminAddReponse extends HttpServlet {

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
            
            /* recuperation des attributs du formulaire reponses */
            
            /* premiere reponse */
            
             long numeroReponse1 = Long.parseLong(request.getParameter("numeroReponse1"));
             String enonceReponse1= request.getParameter("enonceReponse1");
             long lienReponse1Question = Long.parseLong(request.getParameter("lienReponse1Question"));
        
             /* deuxieme reponse */
              long numeroReponse2 = Long.parseLong(request.getParameter("numeroReponse2"));
              String enonceReponse2= request.getParameter("enonceReponse2");
              long lienReponse2Question = Long.parseLong(request.getParameter("lienReponse2Question"));
   
                 /* troisieme reponse */
                 
             long numeroReponse3 = Long.parseLong(request.getParameter("numeroReponse3"));
             String enonceReponse3= request.getParameter("enonceReponse3");
             long lienReponse3Question = Long.parseLong(request.getParameter("lienReponse3Question"));
                
   
        if (numeroReponse1!=0 && !enonceReponse1.equals("") && lienReponse1Question!=0 ) 
        { 
         Question quest1= new Question (lienReponse1Question);
            ReponsePossible repPos1 = new ReponsePossible(numeroReponse1, quest1,enonceReponse1);
            
            ReponsePossibleDAO.insertReponsePossible(repPos1);
            
        }  
        
         if (numeroReponse2!=0 && !enonceReponse2.equals("") && lienReponse2Question!=0 ) 
        { 
         Question quest2= new Question (lienReponse2Question);
            ReponsePossible repPos2 = new ReponsePossible(numeroReponse2, quest2,enonceReponse2);
            
            ReponsePossibleDAO.insertReponsePossible(repPos2);
            
        }  
        
          if (numeroReponse3!=0 && !enonceReponse3.equals("") && lienReponse3Question!=0 ) 
        { 
         Question quest3= new Question (lienReponse3Question);
            ReponsePossible repPos3 = new ReponsePossible(numeroReponse3, quest3,enonceReponse3);
            
            ReponsePossibleDAO.insertReponsePossible(repPos3);
            
        } 
          
          
           List<Question> listQuestions = QuestionDAO.GetAllQuestions();
        
        request.setAttribute("ListeQuestions", listQuestions);
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/showAllQuestions.jsp");
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
