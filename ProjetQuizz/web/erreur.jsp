<%-- 
    Document   : erreur
    Created on : May 14, 2020, 3:47:23 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
			
	<h1> QUIZZ POUR UN CHAMPION </h1>
		
		<!-- La barre du menu -->
                
                		<!-- La barre du menu -->	
			
	<div class="nav-bar">
	
		<!-- icome home  -->
		<a >  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		<!-- Rubrique Apropos  -->
		<a > Apropos</a>
		<!-- Rubrique Contact  -->
		<a > Contact </a>
		<!-- Rubrique Termes d'utilisation  -->
		<a > Termes d'utilisation </a>
		<!-- Rubrique Categories  -->
		<select name="Categories"  > Categories
			<option   >Categories</option>
			<option  >Programmation</option>
			<option  >Statistiques</option>
			<option  >Geographie</option>
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
                                
                                <p style="color:red;"><h1> Loggin ou mot de passe incorrect</h1></p>
                                
                                 <!-- Balise button pour un bouton de retour en arriere -->
        <a href="./index.html"><button id="retourbutton" class="controlbutton">Retour </button></a>
          
                 
                <footer class="footer">
		  
		<p> 2020 tous droits reserves </p>
		  
		  
		  <img class="mediassociauxicons" src="images/facebookicon.png">
		  <img class="mediassociauxicons" src="images/twittericon.jpg">
		  <img class="mediassociauxicons" src="images/instagramicon.png">
		  
		</footer>
    </body>
</html>
