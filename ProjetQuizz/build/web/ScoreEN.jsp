<%-- 
    Document   : ScorEN
    Created on : May 16, 2020, 1:57:06 AM
    Author     : Youssef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
                 Francais<a href="AfficherScore.jsp"><input type="submit" value="FR" name=""></a>
              </p>   
	
               <fmt:setLocale value="en_US"/>
              <fmt:bundle basename="ressources_i18n.Messages" >
	</div>
  
    </head>
    <body>
         <div class="Gestion">  
             
             <h2> <fmt:message key="Count.sa"/> ${utilisateur} </h2><br>
               <h2><fmt:message key="Count.sb"/> Score : ${score} /3</h2>         
         </div>
                 <br>
                  <a href="index.html"><h2><fmt:message key="Count.sc"/></h2></a>
                </fmt:bundle> 
    </body>
</html>