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
                Anglais<a href="langueEN.jsp"><input type="submit" value="EN" name=""></a>
                Espaniol<a href="langueES.jsp"><input type="submit" value="ES" name=""> </a>
            </p>   
	
	</div>
  
    </head>
    <body>
         <div class="Gestion">
        <form name="questionReponse" action="ScoreServlet" method="POST">
            <h2><b><i>Questions Du Quizz</b></i></h2>
                      
            <table border="1">
                <tbody>
                    <tr class="colored">
                        <td>Question 1: Quelle est la capitale du Canada ?</td>
                    <tr>
                        <td>
                            <input type="radio" name="R1" value="New York" />New York <br>
                            <input type="radio" name="R1" value="Ottawa" />Ottawa<br>
                            <input type="radio" name="R1" value="Paris" />Paris
                        </td>
                        </tr>
                    </tr>
                </tbody>
            </table>        
                    <br><br>
             <table border="1">
                <tbody>        
                    <tr class="colored">
                        <td>Question 2: Quelle est la monnaie du Canada ?</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="radio" name="R2" value="Dirham" />Dirham<br>
                            <input type="radio" name="R2" value="Euro" />Euro<br>
                            <input type="radio" name="R2" value="Dollar Canadien" />Dollar Canadien
                        </td>
                    </tr>
              
                </tbody>
            </table>
            
                 <br><br>
             <table border="1">
                <tbody>        
                    <tr class="colored">
                        <td>Question 3: Quel est le nom du premier ministre du Canada ?<br>
                    </tr>
                        <td>
                            <input type="radio" name="R3" value="Trudeau" />Trudeau<br>
                            <input type="radio" name="R3" value="Legault" />Legault<br>                                                  
                            <input type="radio" name="R3" value="Trump" />Trump
                        </td>
                    </tr>
                   
                </tbody>
            </table>  
                 <br><br>
                  <tr>Enter votre nom :<input type="text" name="utilisateur"></tr>
                    <br><br>
                    <input type="submit" value="Envoyer Reponses" name="submit" />
        </form>
         </div>
                 <br>
                 <a href="index.html"><h2>Page d'accueil</h2></a>
    
    </body>
</html>
