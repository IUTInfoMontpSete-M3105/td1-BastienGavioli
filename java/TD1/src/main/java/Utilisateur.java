
public abstract class Utilisateur {

    private String nom;

    private String prenom;

    private String adressePostale;


    private String adresseMail;


    /**
     * Default constructor
     */
    public Utilisateur(String nom, String prenom, String adressePostale, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
    }


    public void consulterDocument(String doc) {
        System.out.println("Voici un affichage du document \"" + doc + " \"");
    }

}