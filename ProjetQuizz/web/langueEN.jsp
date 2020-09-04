<%-- 
    Document   : langueEN
    Created on : May 13, 2020, 11:55:12 AM
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
              <p> Francais<a href="userPage.jsp"><input type="submit" value="FR" name=""></a></p><br>
              <fmt:setLocale value="en_US"/>
              <fmt:bundle basename="ressources_i18n.Messages" >
              
	</div>
  
    </head>
    <body>
         <div class="Gestion">
        <form name="questionReponse" action="ScoreServlet" method="POST">
            <h2><b><i><fmt:message key="Count.one"/><br></b></i></h2>
                      
            <table border="1">
                <tbody>
                    <tr class="colored">
                        <td><fmt:message key="Count.two"/></td>
                    <tr>
                        <td>
                           <input type="radio" name="R1" value="" /><fmt:message key="Count.three"/><br>
                           <input type="radio" name="R1" value="" /><fmt:message key="Count.four"/><br>            
                           <input type="radio" name="R1" value="" /><fmt:message key="Count.five"/>
                        </td>
                        </tr>
                    </tr>
                </tbody>
            </table>        
                    <br><br>
             <table border="1">
                <tbody>        
                    <tr class="colored">
                        <td><fmt:message key="Count.six"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="radio" name="R1" value="" /><fmt:message key="Count.seven"/><br>
                            <input type="radio" name="R1" value="" /><fmt:message key="Count.eight"/><br>            
                            <input type="radio" name="R1" value="" /><fmt:message key="Count.nine"/>
                        </td>
                    </tr>
              
                </tbody>
            </table>
            
                 <br><br>
             <table border="1">
                <tbody>        
                    <tr class="colored">
                        <td><fmt:message key="Count.ten"/><br>
                    </tr>
                        <td>
                            <input type="radio" name="R1" value="" /> <fmt:message key="Count.eleven"/><br>
                            <input type="radio" name="R1" value="" /> <fmt:message key="Count.twelve"/><br>
                            <input type="radio" name="R1" value="" /> <fmt:message key="Count.therteen"/><br>
      
                        </td>
                    </tr>
                    
                </tbody>
            </table>        
                    <br>
                    <input type="submit" value="Envoyer Reponses" name="submit" />
        </form>
         </div>
                 <br>
                 <a href="indexTest.html"><h2><fmt:message key="Count.fourteen"/></h2></a>
                   </fmt:bundle> 
    </body>
</html>
