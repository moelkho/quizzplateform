<%-- 
    Document   : pageAdministrateurEN
    Created on : May 15, 2020, 5:37:00 PM
    Author     : Youssef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	       Francais <a href="pageAdministrateur.jsp"><input type="submit" value="FR" name=""></a>
	
	</div>
        
        <fmt:setLocale value="en_US"/>
        <fmt:bundle basename="ressources_i18n.Messages" >
        
        <h1><fmt:message key="Count.a"/></h1>
        
        <!-- infos Administrateur -->
        
        <div class="Gestion" style="color : red;">
            
            <c:forEach  var="user" items="${Users}">
              <li> <fmt:message key="Count.b"/> : ${user.utilisateurName}</li>
              <li><fmt:message key="Count.c"/> :${user.motdepass}</li>
              <li> <fmt:message key="Count.d"/>: ${user.typeuser}</li>
             
            </c:forEach>
             
        </div>     
        
        <!-- liens vers les pages d'administration -->
        
        <div id="Liens">    
            

       <h2> <a href="ShowAllUsersServlet"> <fmt:message key="Count.e"/> </a></h2>
       <h2> <a href="showAllQuestionsServlet"> <fmt:message key="Count.f"/> </a></h2>
       <h2> <a href="showAllReponsesServlet"> <fmt:message key="Count.g"/></a></h2>
       <h2> <a href="VisualiserQuizzServlet"> <fmt:message key="Count.gg"/> </a></h2>
       

        </div>   

        <h2 > <fmt:message key="Count.h"/></h2>
        
        <!-- formulaire pour ajouter un utilisateur --> 
        
        <div class="Gestion">
       <form method="post" action="AdminAddUser" >
           <table border="2">
               <tr>
                   <td colspan="2">
                        <fmt:message key="Count.i"/>
                    </td>
               </tr>
               <tr>
                    <td class="numero">
                         <fmt:message key="Count.j"/>
                     </td>
                     <td>
                        <input type="text" name="nomUtilisateur">
                     </td>

               </tr>

               <tr>
                     <td>
                         <fmt:message key="Count.k"/>
                     </td>
                     <td>
                         <input type="text" name="motdePassUtilisateur">
                      </td>

                </tr>

                <tr>
                     <td>
                        <fmt:message key="Count.l"/>
                     </td>
                     <td>
                         <select name="typeUtilisateur">
                             <option value="administrateur">  <fmt:message key="Count.ll"/> </option>
                             <option value="utilisateur">  <fmt:message key="Count.lll"/> </option>
                          </select>
                     </td>

                </tr>
                <tr>
                    <td >
                    <button type="submit" name="submit">  <fmt:message key="Count.m"/> </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>

            </table>
         </form>
        </div>

         <h2> <fmt:message key="Count.n"/></h2>
         
          <!-- formulaire pour ajouter une question --> 

         <div class="Gestion">
          <form method="post" action="AdminAddQuestion" >
           <table border="2">
               <tr>
                    <td colspan="2">
                          <fmt:message key="Count.o"/>
                     </td>
               </tr>
               <tr>
                     <td class="numero">
                          <fmt:message key="Count.p"/>
                     </td>
                     <td>
                         <input type="text" name="numeroQuestion">
                     </td>

               </tr>

               <tr>
                     <td>
                          <fmt:message key="Count.pp"/>
                     </td>
                     <td>
                         <textarea name="enonceQuestion" style="width: 180px; height: 100px"> </textarea>
                      </td>

                </tr>


                <tr>
                    <td >
                    <button type="submit" name="submit">  <fmt:message key="Count.q"/> </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>

            </table>

             </form> 
             </div> 

          
              <h2> <fmt:message key="Count.r"/></h2>
              
               <!-- formulaire pour ajouter des reponses  -->
               
            <div class="Gestion">  
              <form method="post" action="AdminAddReponse">
                  <table border="2">
                           <tr>
                     <td class="numero">
                          <fmt:message key="Count.s"/>
                     </td>
                     <td>
                         <input type="text" name="numeroReponse1">
                      </td>

                </tr>

                <tr>
                     <td>
                        <fmt:message key="Count.t"/>
                     </td>
                     <td>
                         <input type="text" name="enonceReponse1">
                      </td>

                </tr>
                  <tr>
                     <td>
                         <fmt:message key="Count.u"/> : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse1Question">
                      </td>

                </tr>
                <tr>
                     <td class="numero">
                          <fmt:message key="Count.v"/>
                     </td>
                     <td>
                         <input type="text" name="numeroReponse2">
                      </td>

                </tr>

                <tr>
                     <td>
                        <fmt:message key="Count.w"/>
                     </td>
                     <td>
                         <input type="text" name="enonceReponse2">
                      </td>

                </tr>
                  <tr>
                     <td>
                         <fmt:message key="Count.x"/> : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse2Question">
                      </td>

                </tr>

                <tr>
                     <td class="numero">
                         <fmt:message key="Count.y"/>
                     </td>
                     <td>
                         <input type="text" name="numeroReponse3">
                      </td>

                </tr>

                <tr>
                     <td>
                         <fmt:message key="Count.z"/>
                     </td>
                     <td>
                         <input type="text" name="enonceReponse3">
                      </td>

                </tr>
                  <tr>
                     <td>
                         <fmt:message key="Count.aa"/> : 
                     </td>
                     <td>
                         <input type="text" name="lienReponse3Question">
                      </td>

                </tr>

                 <tr>
                    <td >
                    <button type="submit" name="submit"><fmt:message key="Count.bb"/> </button>
                    </td>
                    <td >
                    <button type="reset" name="rest"> Reset </button>
                    </td>
                </tr>
                      </table>

        </form>
     </div>     
              
        <!-- Balise button pour un bouton de retour en arriere -->
        <a href="./index.html"><button id="retourbutton" class="controlbutton"> <fmt:message key="Count.cc"/> </button></a>
	  </fmt:bundle> 	
		
    </body>
</html>
