<%-- 
    Document   : showAllQuestions
    Created on : May 14, 2020, 3:17:31 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        <title>La liste des questions </title>
    </head>
    <body>
        
         <div class="nav-bar">
	
		<!-- icome home  -->
		<a href="./index.html" >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
		 <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
	
	
	</div>
        <h1>La liste des questions </h1>
        
              <!-- Balise button pour un bouton de retour en arriere -->
        <a href="javascript:history.back()"><button id="retourbutton" class="controlbutton">Retour </button></a>
      
        
         <!-- Affichage et possibilite de supprimer les questions ou les reponses
            : il faut supprimer les reponses avant les questions (Foreign Keys)--> 
        
        <div class="Gestion">
      <table border="2">
            <tr>
            <th> Numero de Question :</th>
            <th> Enonce de la question  </th>
            <th> Supprimer  </th>
            
            </tr>
            <c:forEach var="question" items="${ListeQuestions}">
                <tr>
            <td class="colonneId"><c:out value = "${question.idQuestion}" /></td> 
            <td ><c:out value= "${question.enonceQuestion}" /> </td>
          
            <td class="colonneId"> <a href="DeleteQuestionServlet?id=<c:out value ='${question.idQuestion}'/>"> Supprimer</a> </td>
            </tr>
            <c:forEach var="rep" items="${question.reponsePossibles}">
                <tr>
                    <td class="numero"> id Reponse : ${rep.idReponse}</td>
                    <td> Enonce Reponse :${rep.enonceReponse}</td>
                    <td class="numero"> <a href="DeleteReponseServlet?id=<c:out value ='${rep.idReponse}'/>"> Supprimer</a></td>
                 </tr>
               </c:forEach> 
            </c:forEach>
            
            
            </table>
           </div> 
        
         
    </body>
</html>
