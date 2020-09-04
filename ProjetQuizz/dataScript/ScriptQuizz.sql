DROP TABLE SCORE CASCADE CONSTRAINTS;
DROP TABLE QUESTION CASCADE CONSTRAINTS;
DROP TABLE QUESTIONNAIRE_QUESTION CASCADE CONSTRAINTS;
DROP TABLE UTILISATEUR CASCADE CONSTRAINTS;
DROP TABLE REPONSE_POSSIBLE CASCADE CONSTRAINTS;

/* creation table utilisateur */
CREATE table UTILISATEUR
(

utilisateur_name VARCHAR(30) PRIMARY KEY,
motDePass VARCHAR(30) NOT NULL,
typeUser VARCHAR(15) NOT NULL 
               CHECK (typeUser IN ('utilisateur','administrateur'))

  );

/* creation table question */
CREATE TABLE QUESTION 
(
    id_question NUMBER(10)  PRIMARY KEY,
    
    enonce_question VARCHAR(200) 

);


/* creation table reponses possibles */
CREATE TABLE REPONSE_POSSIBLE
(
    id_reponse NUMBER(10)  PRIMARY KEY,
    
    enonce_reponse VARCHAR(100) ,
    id_question NUMBER(10),
    
   
    FOREIGN KEY (id_question) REFERENCES QUESTION (id_question)
);

/* creation table questionnaire question */

CREATE TABLE QUESTIONNAIRE_QUESTION
( 
  id_question NUMBER(10),
  id_reponse NUMBER(10),
  
    FOREIGN KEY (id_question) REFERENCES QUESTION (id_question),
    FOREIGN KEY (id_reponse) REFERENCES REPONSE_POSSIBLE (id_reponse),
    PRIMARY KEY (id_question,id_reponse)
);


/* creation d'une table Score */
CREATE TABLE SCORE 
(   
 
    score NUMBER(4),
PRIMARY KEY (score ,utilisateur_name),
utilisateur_name VARCHAR(30),
FOREIGN KEY (utilisateur_name) REFERENCES UTILISATEUR (utilisateur_name)



);