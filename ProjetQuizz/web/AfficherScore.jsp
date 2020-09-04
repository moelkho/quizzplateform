<%-- 
    Document   : saisirLang1
    Created on : May 9, 2020, 11:36:28 PM
    Author     : Youssef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./index-style.css" rel="stylesheet" media="all" type="text/css">
        
                
        <div class="nav-bar">
	
            <!-- icome home  -->
            <a href="./index.html">  <img  src="images/homeicon.png" alt="home icon"  id="imghome"  /> </a>
		
             <img  src="images/profilicon.jpg" alt="profil icon"  id="imgprofil"  />
             <br>
	      <p>
                Anglais<a href="ScoreEN.jsp"><input type="submit" value="EN" name=""></a>
                Espaniol<a href="ScoreES.jsp"><input type="submit" value="ES" name=""> </a>
            </p>   
	
	</div>
  
    </head>
    <body>
         <div class="Gestion">  
             
               <h2> Voila ${utilisateur} </h2><br>
               <h2>Votre Score : ${score} /3</h2>         
         </div>
                 <br>
                  <a href="index.html"><h2>Autre QUIZZ</h2></a>
   
    </body>
</html>

