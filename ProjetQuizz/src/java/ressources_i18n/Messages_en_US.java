/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources_i18n;

import java.util.ListResourceBundle;
import static ressources_i18n.Messages_es_ES.contents;

/**
 *
 * @author Youssef
 */
public class Messages_en_US extends ListResourceBundle {

    @Override
    public Object[][] getContents() {
        return contents;      
    }
    static final Object[][] contents = {
        
//        User page
        {"Count.one", "Quiz Questions"},
        {"Count.two", "Question 1: What is the capital of Canada?"},
        {"Count.three", "New York"},
        {"Count.four", "Ottawa"},
        {"Count.five", "Paris"},            
        {"Count.six", "Question 2: What is Canada's currency?"},
        {"Count.seven", "Dirham"},
        {"Count.eight", "Euro"},
        {"Count.nine", "Canadien Dollar"},        
        {"Count.ten", "Question 3: What is the name of the Prime Minister of Canada?"},
        {"Count.eleven", "Trudeau"},
        {"Count.twelve", "Legault"},
        {"Count.therteen", "Trump"},
        {"Count.fourteen", "Main page"},
        
//        Administartor page
        {"Count.a", "User and Question Management"},
        {"Count.b", "Hello"},
        {"Count.c", "Your password is"},
        {"Count.d", "Your are a/an"},
        {"Count.e", "Show Users"},
        {"Count.f", "Show Questions"},
        {"Count.g", "View questions and answers"},
        {"Count.gg", " View the Quiz"},       
        {"Count.h", " User Management"},
        {"Count.i", " Add User"},
        {"Count.j", " User Name"},
        {"Count.k", " Pass Word"},
        {"Count.l", " User Type"},
        {"Count.ll", " Administrators"},
        {"Count.lll", " Users"},
        {"Count.m", " Send"},
        {"Count.n", " Questions Management"},
        {"Count.o", " Add Question"},
        {"Count.p", " Question Number"},
        {"Count.pp", " Enonce Question"},
        {"Count.q", " Send"},
        {"Count.r", " Response management"},
        {"Count.s", " Answer Number 1"},
        {"Count.t", " Enonce Number 1"},
        {"Count.u", " Link to Question number:"},
        {"Count.v", " Answer Number 2"},
        {"Count.w", " Enonce Number 2"},
        {"Count.x", " Link to Question number:"},
        {"Count.y", " Answer Number 3"},
        {"Count.z", " Enonce Number 3"},
        {"Count.aa", " Link to Question number:"},
        {"Count.bb", " Send"},
        {"Count.cc", " Return"},
        {"Count.dd", " Next"},
         
//        Main page
        {"Count.am", " QUIZ FOR A CHAMPION"},
        {"Count.bm", " About"},
        {"Count.cm", " Contact"},
        {"Count.dm", " Terms of use"},
        {"Count.em", " Programming"},
        {"Count.fm", " Statistics"},
        {"Count.gm", " Geography"},
        {"Count.hm", " Name"},
        {"Count.im", " Pass Word"},
        {"Count.jm", " Compte Admin : mohamed  // mot de passe : 1234"},
        {"Count.km", " User account: youssef // password: 5678"},
        {"Count.lm", " Otherwise in the case of authentication leads to an error page"},
        {"Count.mm", " 2020 all rights reserved"},

//        Score page
        {"Count.sa", " Here is"},
        {"Count.sb", " Your Score"},
        {"Count.sc", " Other quiz"},
               
    };
}
