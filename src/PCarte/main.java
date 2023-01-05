package PCarte;


import javax.swing.plaf.IconUIResource;

public class main {

    public static void testAfficher() {
        Carte carte = new Carte(Valeur.AS, Couleur.COEUR);
        carte.afficher();
    }

    public static void testAffecter() {
        Carte carte1 = new Carte(Valeur.AS, Couleur.COEUR);
        Carte carte2 = new Carte(Valeur.ROI, Couleur.PIQUE);
        carte1.affecter(carte2);
        assert(carte1.a_valeur, Valeur.ROI);
        assert(carte1.a_couleur, Couleur.PIQUE);
    }

    public static void testEquals() {
        Carte carte1 = new Carte(Valeur.AS, Couleur.COEUR);
        Carte carte2 = new Carte(Valeur.AS, Couleur.COEUR);
        Carte carte3 = new Carte(Valeur.ROI, Couleur.PIQUE);
        assert(carte1.equals(carte2));
        assert(carte1.equals(carte3));
    }

    public static void testSetType() {
        Carte carte = new Carte(Valeur.AS, Couleur.PIQUE);
        carte.setType(Couleur.PIQUE);
        assert(carte.a_couleur, Couleur.PIQUE);
    }

    public static void testSetValeur() {
        Carte carte = new Carte(Valeur.AS, Couleur.COEUR);
        carte.setValeur(Valeur.ROI);
        assert(carte.a_valeur, Valeur.ROI);
    }

    public static void main(String[] args) {
        testAfficher();
        System.out.print(" ");
        testAffecter();
        System.out.print(" ");
        testEquals();
        System.out.print(" ");
        testSetType();
        System.out.print(" ");
        testSetValeur();
    }
}
