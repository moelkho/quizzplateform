<%-- 
    Document   : showAllResponses
    Created on : May 14, 2020, 5:11:12 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        <title> Liste des Reponses</title>
    </head>
    <body>
          
           
            <div class="nav-bar">
	
		<!-- icome home  -->
		<a href="./index.html" >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
		 <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
                 
	
         
	
	</div>
                 <h1>La liste des questions et leurs reponses </h1>
            
             <!-- Balise button pour un bouton de retour en arriere -->
        <a href="javascript:history.back()"><button id="retourbutton" class="controlbutton">Retour </button></a>
        <a href="pageAdministrateur.jsp"></a>  
        
       <div class="Gestion">
      <table border="2">
            <tr>
            <th> Numero Question:</th>
            <th> Enonce Question </th>
            <th class="colonneId"> Id Reponse 1  </th>
            <th> Enonce Reponse 1 </th>
            <th class="colonneId"> Id Reponse 2  </th>
            <th> Enonce Reponse 2 </th>
            <th class="colonneId"> Id Reponse 3 </th>
            <th> Enonce Reponse 3 </th>
            
            </tr>
            <c:forEach var="question" items="${ListeReponses}">
                <tr>
            <td><c:out value = "${question.idQuestion}" /></td> 
            <td><c:out value= "${question.enonceQuestion}" /> </td>
            <c:forEach var="rep" items="${question.reponsePossibles}">
                <td><c:out value = "${rep.idReponse}" /></td> 
                <td><c:out value = "${rep.enonceReponse}" /></td> 
                </c:forEach>
            </tr>
            </c:forEach>
            </table>
       </div>  
           
         
           
            
    </body>
</html>
