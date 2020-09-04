/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.QuestionDAO.session;
import static DAO.UtilisateurDAO.session;
import entite.Score;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class ScoreDAO {
    
            static Session session = null;
    
            public static List<Score> GetScore()
        {      List<Score> listOfScores = null;
            session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            
            Query query = session.createQuery("from Score");
            
            listOfScores= query.list();
            session.close();
             return listOfScores;
        }
            

        
        public static void insertScore(Score score)
     {  
         session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         session.save(score);
         tx.commit();
         session.close();
     }    
            
     }