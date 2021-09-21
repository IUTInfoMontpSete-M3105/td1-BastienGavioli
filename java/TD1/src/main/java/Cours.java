import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int semestre;


    /**
     * @param doc
     */
    public void uploadDoc(String doc) {

    }

    /**
     * @param ens
     */
    public void informEns(Enseignant ens) {
        System.out.println("L'enseignant est informé.");
    }

    /**
     * @param etu
     */
    public void informerEtud(Etudiant etu) {
        System.out.println("L'étudiant est informé.");
    }

}