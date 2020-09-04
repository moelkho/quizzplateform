/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entite.Utilisateur;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitaire.NewHibernateUtil;

/**
 *
 * @author Youssef
 */
public class UtilisateurDAO {
            
        static Session session = null;
        
        public static void insertUtilisateur(Utilisateur utilisateur)
     {  
         session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         session.save(utilisateur);
         tx.commit();
         session.close();
     }
     
public static void deleteUtilisateur(String nom)
        { session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         
         Utilisateur utilisateur = (Utilisateur) session.get(Utilisateur.class, nom);
         if (utilisateur != null)
         {session.delete(utilisateur);}
         tx.commit();
        }
        
        public static List<Utilisateur> GetAllUsers()
        {      List<Utilisateur> listOfUsers = null;
            session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Utilisateur");
            listOfUsers = query.list();
            session.close();
        return listOfUsers;
        }



}
