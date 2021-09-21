
public class ChargeDeCours extends Enseignant {

    /**
     * Default constructor
     */
    public ChargeDeCours(String nom, String prenom, String adressePostale, String adresseMail, int numem, int harpege) {
        super(nom, prenom, adressePostale, adresseMail, numem, harpege);
    }

    public void affecterEnseignant(Enseignant ens, Rendu r) {
        r.affecterEns(ens);
    }

    public Certificat délivrerCertificat() {
        return new Certificat();
    }

}