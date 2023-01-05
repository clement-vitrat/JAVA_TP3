/*
 * Nom de classe : Carte
 * Description   : Cette classe créé une Carte et ses différentes caractéristiques
 * Version       : 1.0
 * Date          : 03/01/2022
 * Copyright     : Clément VITRAT
 */

/* Stockage du fichier dans un Package PCarte avec tous les autres ex's */
package PCarte;



public class Carte {

    /* Appel de l'énumération avec les Couleurs */
    Couleur a_couleur;
    /* Appel de l'énumération avec les Valeurs */
    Valeur a_valeur;

    /**
     * Création du constructeur
     * @param a_valeur
     * @param a_couleur
     */
    public Carte(Valeur a_valeur, Couleur a_couleur) {
        this.a_valeur = a_valeur;
        this.a_couleur = a_couleur;
    }

    /**
     * Création d'un constructeur
     * @param carte
     */
    public Carte(Carte carte) {
        this.a_valeur = carte.a_valeur;
        this.a_couleur = carte.a_couleur;
    }

    /**
     * Permet d'afficher la carte
     * @return a_valeur, la valeur de la carte
     * @return a_couleur, la couleur de la carte
     */
    public void afficher() {
        System.out.print("Votre carte est un " + this.a_valeur + " de " + this.a_couleur);
    }

    /**
     *
     * @param carte
     */
    public void affecter(Carte carte) {
        this.a_couleur = carte.a_couleur;
        this.a_valeur = carte.a_valeur;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Carte) {
            Carte carte = (Carte) obj;
            return carte.a_couleur == this.a_couleur && carte.a_valeur == this.a_valeur;
        }
        return super.equals(obj);
        // return false;
    }

    /**
     * Permet de retourner la couleur de la carte
     * @param a_couleur
     */
    public void setType(Couleur a_couleur) {
        this.a_couleur = a_couleur;
    }

    /**
     * Permet de retourner la valeur de la carte
     * @param a_valeur
     */
    public void setValeur(Valeur a_valeur) {
        this.a_valeur = a_valeur;
    }

}

