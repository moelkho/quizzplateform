/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entite.Question;
import entite.ReponsePossible;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class ReponsePossibleDAO {
    
     static Session session = null;
        
        public static void insertReponsePossible(ReponsePossible reponsePossible)
     {  
         session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         session.save(reponsePossible);
         tx.commit();
         session.close();
     }
     
public static void deleteReponsePossible(long idreponsePossible)
        { session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         
         ReponsePossible reponsePossible = (ReponsePossible) session.get(ReponsePossible.class, idreponsePossible);
         if (reponsePossible != null)
         {session.delete(reponsePossible);}
         tx.commit();
        }
        
        public static List<Question> GetAllReponsePossible()
        {      List<Question> listOfResponses = null;
            session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Question " );
               
          
            listOfResponses  = query.list();
            session.close();
        return listOfResponses ;
        
        }
}

