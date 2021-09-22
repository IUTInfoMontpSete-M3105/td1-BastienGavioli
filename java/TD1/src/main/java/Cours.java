
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    private String nom;

    private int semestre;

    public void uploadDoc(String doc) {
        System.out.println("Le doc " + doc + " a été publié");
    }

    public void informEns(Enseignant ens) {
        System.out.println("L'enseignant " + ens + " est informé.");
    }

    public void informerEtud(Etudiant etu) {
        System.out.println("L'étudiant " + etu + " est informé.");
    }

}