public class App {
    public static void main(String[] args) {
        Cours c = new Cours("maths", 3);
        Devoir d1 = new Devoir("Exo1", "description1", "30 septembre 2021", 18);
        Devoir d2 = new Devoir("Exo2", "description2", "30 octobre 2021", 10);
        ChargeDeCours ens1 = new ChargeDeCours("Terrieur", "Alain", "adressePostale1",
                "email1", 123, 456);
        Enseignant ens2 = new Enseignant("Terrieur", "Alex", "adressePostale2",
                "email2", 987, 654);
        Etudiant e1 = new Etudiant("AAA", "BBB", "CCC", "DDD", 000);
        Etudiant e2 = new Etudiant("WWW", "XXX", "YYY", "ZZZ", 111);
        Rendu r = e1.rendreDevoir();
        ens1.affecterEnseignant(ens2, r);

    }
}
