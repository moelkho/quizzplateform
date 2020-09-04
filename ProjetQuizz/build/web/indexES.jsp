<%-- 
    Document   : indexEN
    Created on : May 15, 2020, 8:24:31 PM
    Author     : Youssef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Quizz</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
    </head>
    <body>
        <!-- Le titre du site -->
	<fmt:setLocale value="es_ES"/>
        <fmt:bundle basename="ressources_i18n.Messages" >		
	<h1><fmt:message key="Count.am"/></h1>
		
		<!-- La barre du menu -->
                
                		<!-- La barre du menu -->	
			
	<div class="nav-bar">
	
		<!-- icome home  -->
		<a >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
               
                <p>Francais<a href="index.html"><input type="submit" value="FR" name=""></a></p>
		<!-- Rubrique Apropos  -->
		<a > <fmt:message key="Count.bm"/></a>
		<!-- Rubrique Contact  -->
		<a > Contact </a>
		<!-- Rubrique Termes d'utilisation  -->
		<a > <fmt:message key="Count.dm"/></a>
		<!-- Rubrique Categories  -->
		<select name="Categories"  > Categories
			<option  >Categories</option>
			<option  ><fmt:message key="Count.em"/></option>
			<option  ><fmt:message key="Count.fm"/></option>
			<option  ><fmt:message key="Count.gm"/></option>
			<option  > Literature</option>
		</select> 
		
		<!-- Rubrique Recherche  -->
		<input class="champ" type="text" value="Search...)"/>
		<!-- Rubrique login  -->
		<input type="text" name="login" value="loggin" >
		<!-- Rubrique Mot de passe  -->
		<input type="password" name="mot de passe" value="motdepasse" >
		<!-- Bouton soumettre  -->
		<input id="btnsubmit" type="submit" value="Submit">
		<!-- icone profil -->
		 <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
	
	
	</div>
                                
                <!-- formulaire d'authentification -->
         <div class="Gestion">       
        <form method="post" action="AuthentificationServlet">
            <table border="2">
                <tr>
                    <td>
                         <fmt:message key="Count.hm"/> :
                    </td>
                     <td>
                         <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td> 
                        <fmt:message key="Count.im"/> :
                     </td>
                    <td>
                       <input type="password" name="password"> 
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                <button type="submit" name="submit"> Submit </button>
                    </td>
                 </tr>
            </table>
        </form>
         </div>       
                 <h3> Infos Test</h3>
                           <p><fmt:message key="Count.jm"/></p><br>
                           <p><fmt:message key="Count.km"/></p><br>
                           <p> <fmt:message key="Count.lm"/></p>
                                
                <footer class="footer">
		  
		<p> <fmt:message key="Count.mm"/> </p>
		  
		  
		  <img class="mediassociauxicons" src="images/facebookicon.png">
		  <img class="mediassociauxicons" src="images/twittericon.jpg">
		  <img class="mediassociauxicons" src="images/instagramicon.png">
		  
		</footer>
           </fmt:bundle> 	
    </body>
</html>

