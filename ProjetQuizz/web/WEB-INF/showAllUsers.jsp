<%-- 
    Document   : showAllUsers
    Created on : May 14, 2020, 12:34:58 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        <title>La liste des utilisateurs</title>
    </head>
    <body>
        
         <div class="nav-bar">
	
		<!-- icome home  -->
		<a href="./index.html" >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
		 <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
	
	
	</div>
        
        <h1>La liste des utilisateurs</h1>
        
               <!-- Balise button pour un bouton de retour en arriere -->
        <a href="javascript:history.back()"><button id="retourbutton" class="controlbutton">Retour </button></a>
       
        
      <table class="Gestion" border="2">
            <tr>
            <th> Nom :</th>
            <th> Mot de Pass : </th>
            <th> Type : </th>
            <th> Supprimer : </th>
            </tr>
            <c:forEach var="utilisateur" items="${Liste}">
                <tr>
            <td><c:out value = "${utilisateur.utilisateurName}" /></td> 
            <td><c:out value= "${utilisateur.motdepass}" /> </td>
            <td> <c:out value = "${utilisateur.typeuser}" /> </td>
            <td> <a href="DeleteUserServlet?nom=<c:out value ='${utilisateur.utilisateurName}'/>"> Supprimer</a> </td>
            </tr>
            </c:forEach>
            </table>
        
       
        
          <footer class="footer">
		  
		<p> 2020 tous droits reserves </p>
		  
		  
		  <img class="mediassociauxicons" src="images/facebookicon.png">
		  <img class="mediassociauxicons" src="images/twittericon.jpg">
		  <img class="mediassociauxicons" src="images/instagramicon.png">
		  
		</footer>

    </body>
</html>
