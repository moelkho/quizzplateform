package entite;
// Generated May 14, 2020 12:05:01 AM by Hibernate Tools 4.3.1



/**
 * Score generated by hbm2java
 */
public class Score  implements java.io.Serializable {


     private ScoreId id;
     private Utilisateur utilisateur;

    public Score() {
    }

    public Score(ScoreId id, Utilisateur utilisateur) {
       this.id = id;
       this.utilisateur = utilisateur;
    }
   
    public ScoreId getId() {
        return this.id;
    }
    
    public void setId(ScoreId id) {
        this.id = id;
    }
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }




}


