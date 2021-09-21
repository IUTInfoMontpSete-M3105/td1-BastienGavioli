/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */
      public Enseignant(String nom, String prenom, String adressePostale, String adresseMail, int numem, int harpege) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numem = numem;
        this.harpege = harpege;
    }

    /**
     * 
     */
    private int numem;

    /**
     * 
     */
    private int harpege;

}