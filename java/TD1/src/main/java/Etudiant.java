
public class Etudiant extends Utilisateur {

    /**
     * Default constructor
     */
    public Etudiant(String nom, String prenom, String adressePostale, String adresseMail, int numeroEtudiant) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numeroEtudiant = numeroEtudiant;
    }

    private int numeroEtudiant;

    public Rendu rendreDevoir() {
        return new Rendu("Texte.pdf", "13/10/21");
    }

}