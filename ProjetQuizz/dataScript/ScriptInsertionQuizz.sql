/* insertion dans la table utilisateur */

INSERT INTO UTILISATEUR VALUES ('mohamed','1234','administrateur');
INSERT INTO UTILISATEUR VALUES('youssef','5678','utilisateur');
INSERT INTO UTILISATEUR VALUES('rachid','9101112','utilisateur');
INSERT INTO UTILISATEUR VALUES('ali','13141516','utilisateur');



/* insertion dans la table question */

INSERT INTO QUESTION VALUES(001,'Quelle est la capitale du Canada ?');
INSERT INTO QUESTION VALUES(002,'Quelle est la monnaie du Canada ?');
INSERT INTO QUESTION VALUES (003, 'Quel est le nom du premier ministre du Canada ?');

/* insertion dans la table reponses possibles */

INSERT INTO REPONSE_POSSIBLE VALUES(1,'New York',001);
INSERT INTO REPONSE_POSSIBLE VALUES(2,'Ottawa',001);
INSERT INTO REPONSE_POSSIBLE VALUES(3,'Paris',001);
INSERT INTO REPONSE_POSSIBLE VALUES(4,'Dirham',002);
INSERT INTO REPONSE_POSSIBLE VALUES(5,'Pound',002);
INSERT INTO REPONSE_POSSIBLE VALUES(6,'Dollar Canadien',002);
INSERT INTO REPONSE_POSSIBLE VALUES(7,'Trudeau',003);
INSERT INTO REPONSE_POSSIBLE VALUES(8,'Legault',003);
INSERT INTO REPONSE_POSSIBLE VALUES(9,'Trump',003);

/* insertion dans la table questionnaire question */

INSERT INTO QUESTIONNAIRE_QUESTION VALUES (001,2);
INSERT INTO QUESTIONNAIRE_QUESTION VALUES (002,6);
INSERT INTO QUESTIONNAIRE_QUESTION VALUES (003,7);

/* insertion dans la table score */

INSERT INTO SCORE VALUES (3,'youssef');
INSERT INTO SCORE VALUES (3,'rachid');