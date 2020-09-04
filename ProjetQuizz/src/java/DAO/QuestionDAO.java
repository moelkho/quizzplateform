/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entite.Question;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class QuestionDAO {
          static Session session = null;
        
        public static void insertQuestion(Question question)
     {  
         session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         session.save(question);
         tx.commit();
         session.close();
     }
     
public static void deleteQuestion(long idQuestion)
        { session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         
         Question question = (Question) session.get(Question.class, idQuestion);
         if (question != null)
         {session.delete(question);}
         tx.commit();
        }
        
        public static List<Question> GetAllQuestions()
        {      List<Question> listOfQuestions = null;
            session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Question");
            listOfQuestions= query.list();
            session.close();
        return listOfQuestions;
        }

}
