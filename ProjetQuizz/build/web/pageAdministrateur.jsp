<%-- 
    Document   : pageAdministrateur
    Created on : May 13, 2020, 10:53:29 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        
        <title>Page Administrateur </title>
        
    </head>

    <body>
        
        <div class="nav-bar">
	
            <!-- icome home  -->
            <a href="./index.html">  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
             <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
             
	        <p>Anglais <a href="pageAdministrateurEN.jsp"><input type="submit" value="EN" name=""></a>
                    Espaniol<a href="pageAdministrateurES.jsp"><input type="submit" value="ES" name=""></a>
                </p> 
	
	</div>
        
        
        <h1> Gestion des Utilisateurs et des Questions </h1>
        
        <!-- infos Administrateur -->
        
        <div class="Gestion" style="color : red;">
            
            <c:forEach  var="user" items="${Users}">
              <li> Bonjour : ${user.utilisateurName}</li>
              <li>Votre mot de passe est :${user.motdepass}</li>
              <li> Vous etes un : ${user.typeuser}</li>
             
            </c:forEach>
             
        </div>     
        
        <!-- liens vers les pages d'administration -->
        
        <div id="Liens">    
            

       <h2> <a href="ShowAllUserServlet"> Afficher Les utilisateurs </a></h2>
       <h2> <a href="showAllQuestionsServlet"> Afficher Les questions </a></h2>
       <h2> <a href="showAllReponsesServlet"> Visualiser les questions et les reponses </a></h2>
       <h2> <a href="VisualiserQuizzServlet"> Visualiser le Quizz </a></h2>
       

        </div>   

        <h2 > Gestion des utilisateurs</h2>
        
        <!-- formulaire pour ajouter un utilisateur --> 
        
        <div class="Gestion">
       <form method="post" action="AdminAddUser" >
           <table border="2">
               <tr>
                   <td colspan="2">
                        Ajouter Utilisateur
                    </td>
               </tr>
               <tr>
                    <td class="numero">
                        Nom d'utilisateur
                     </td>
                     <td>
                        <input type="text" name="nomUtilisateur">
                     </td>

               </tr>

               <tr>
                     <td>
                         mot de Passe 
                     </td>
                     <td>
                         <input type="text" name="motdePassUtilisateur">
                      </td>

                </tr>

                <tr>
                     <td>
                        Type Utilisateur
                     </td>
                     <td>
                         <select name="typeUtilisateur">
                             <option value="administrateur"> Administrateur </option>
                             <option value="utilisateur"> Utilisateur </option>
                          </select>
                     </td>

                </tr>
                <tr>
                    <td >
                    <button type="submit" name="submit"> Submit </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>

            </table>
         </form>
        </div>

         <h2> Gestion des questions</h2>
         
          <!-- formulaire pour ajouter une question --> 

         <div class="Gestion">
          <form method="post" action="AdminAddQuestion" >
           <table border="2">
               <tr>
                    <td colspan="2">
                         Ajouter Question
                     </td>
               </tr>
               <tr>
                     <td class="numero">
                         Numero de la question
                     </td>
                     <td>
                         <input type="text" name="numeroQuestion">
                     </td>

               </tr>

               <tr>
                     <td>
                         Enonce Question
                     </td>
                     <td>
                         <textarea name="enonceQuestion" style="width: 180px; height: 100px"> </textarea>
                      </td>

                </tr>


                <tr>
                    <td >
                    <button type="submit" name="submit"> Submit </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>

            </table>

             </form> 
             </div> 

          
              <h2>Gestion des reponses </h2>
              
               <!-- formulaire pour ajouter des reponses  -->
               
            <div class="Gestion">  
              <form method="post" action="AdminAddReponse">
                  <table border="2">
                           <tr>
                     <td class="numero">
                         Numero Reponse 1
                     </td>
                     <td>
                         <input type="text" name="numeroReponse1">
                      </td>

                </tr>

                <tr>
                     <td>
                        Enonce Reponse 1
                     </td>
                     <td>
                         <input type="text" name="enonceReponse1">
                      </td>

                </tr>
                  <tr>
                     <td>
                        Lien avec la Question numero : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse1Question">
                      </td>

                </tr>
                <tr>
                     <td class="numero">
                         Numero Reponse 2
                     </td>
                     <td>
                         <input type="text" name="numeroReponse2">
                      </td>

                </tr>

                <tr>
                     <td>
                        Enonce Reponse 2
                     </td>
                     <td>
                         <input type="text" name="enonceReponse2">
                      </td>

                </tr>
                  <tr>
                     <td>
                        Lien avec la Question numero : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse2Question">
                      </td>

                </tr>

                <tr>
                     <td class="numero">
                         Numero Reponse 3
                     </td>
                     <td>
                         <input type="text" name="numeroReponse3">
                      </td>

                </tr>

                <tr>
                     <td>
                        Enonce Reponse 3
                     </td>
                     <td>
                         <input type="text" name="enonceReponse3">
                      </td>

                </tr>
                  <tr>
                     <td>
                        Lien avec la Question numero : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse3Question">
                      </td>

                </tr>

                 <tr>
                    <td >
                    <button type="submit" name="submit"> Submit </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>
                      </table>

        </form>
     </div>     
              
        <!-- Balise button pour un bouton de retour en arriere -->
        <a href="./index.html"><button id="retourbutton" class="controlbutton">Retour </button></a>
		
		
    </body>
</html>
