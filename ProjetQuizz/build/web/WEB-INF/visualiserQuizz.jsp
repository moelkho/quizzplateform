<%-- 
    Document   : visualiserQuizz
    Created on : May 15, 2020, 12:37:18 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        
        <title>Visualiser Quizz</title>
    </head>
    <body>
        
            <div class="nav-bar">
	
                <!-- icome home  -->
		<a href="./index.html" >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
                 <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
	
	
                </div>
        
                 <h1>Visualiser Quizz</h1>
                 
        <!-- Balise button pour un bouton de retour en arriere -->
        <a href="javascript:history.back()"><button id="retourbutton" class="controlbutton">Retour </button></a>   
        
        
                <!-- visualisation du Quizz -->
        
                 <form class="Gestion">
                     <table border="2">
                <c:forEach var="question" items="${ListeReponses}">
                 <tr>
                   <td class="colonneId"> Enonce Question </td>  
                   <td><c:out value= "${question.enonceQuestion}" /></td>
                </tr>   
                <c:forEach var="rep" items="${question.reponsePossibles}"> 
                 <tr>
                    <td class="numero" > Reponse : </td>
                    <td>
                    <input type="radio" name="reponses" value="${rep.enonceReponse}"> ${rep.enonceReponse}<br>
                    </td> 
                </c:forEach>
              </tr>
                 
           
            </c:forEach>
              </table>
        </form>
        
    </body>
</html>
