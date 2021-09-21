
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(String document, String date) {
        this.document = document;
        this.date = date;
    }

    private String document;

    private String date;

    private float points;

    public void setDocument(String doc) {
        document = doc;
    }

    public void affecterEns(Enseignant ens, Cours c) {
        c.informEns(ens);
    }
    public String getDoc() {
        return document;
    }

    public void setNote(int note) {
        points = note;
    }

}