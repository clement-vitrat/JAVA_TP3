package PJoueur;

public class Main {

    public static void testAfficherJoueur() {
        Joueur joueur = new Joueur("Doe", "John", "JDoe");
        joueur.afficher();
    }

    public static void testSetNom() {
        Joueur joueur = new Joueur("Doe", "John", "JDoe");
        joueur.setNom("Smith");
        assert(joueur.nom, "Smith");
    }

    public static void testSetPrenom() {
        Joueur joueur = new Joueur("Doe", "John", "JDoe");
        joueur.setPrenom("Jean");
        assert(joueur.setPrenom("Jean");
    }

    public static void main(String[] args) {
        testAfficherJoueur();
    }
}
