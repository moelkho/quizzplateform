<%-- 
    Document   : passerQuizz
    Created on : May 15, 2020, 12:47:46 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Quizz </h1>
        <p> Bonjour ${nom}</p>
        
        
        <form>
         <c:forEach var="question" items="${ListeReponses}">
             <tr> <td>Enonce question </td>
                    <td><p><c:out value= "${question.enonceQuestion}" /></p> </td>
                 </tr>   
                 
            <c:forEach var="rep" items="${question.reponsePossibles}">
                <tr> <td> <input type="radio"></td>
                
                    <td> <p> <c:out value = "${rep.enonceReponse}" /></p> </td> 
                </c:forEach>
            </tr>
            </c:forEach>
        </form>
    </body>
</html>
