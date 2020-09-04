/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import DAO.ScoreDAO;
import entite.ReponsePossible;
import entite.Score;
import entite.ScoreId;
import entite.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import static servlets.AuthentificationServlet.session;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class ScoreServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String utilisateur = request.getParameter("utilisateur");
            int score, note1, note2, note3 =0;

            String R1 = request.getParameter("R1");
            String R2 = request.getParameter("R2");
            String R3 = request.getParameter("R3"); 
            
             if( R1.equals("Ottawa"))
             {
                 note1=1;
             }
             else
             {
                 note1=0; 
             }
             if(R2.equals("Dollar Canadien"))
             {
                 note2=1;
             }
             else
             {
                 note2=0; 
             }
             if(R3.equals("Trudeau"))
             {
                 note3=1;
             }
             else
             {
                 note3=0; 
             }
             score=note1+note2+note3;
             
//               HttpSession session= request.getSession();
               request.setAttribute("score", score);
               request.setAttribute("utilisateur", utilisateur);
               
              ScoreId si=new ScoreId((short) score, utilisateur);
              Utilisateur nom = new Utilisateur(utilisateur);
              Score scr = new Score(si, nom);

              if ( !utilisateur.equals(""))
                 {
                     ScoreDAO.insertScore(scr);

                 }
                 RequestDispatcher rd = request.getRequestDispatcher("AfficherScore.jsp");
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
