/*
 * Nom de classe : Resultat
 * Description   : Cette classe permet de retourner le résultat du Joueur
 * Version       : 1.0
 * Date          : 03/01/2022
 * Copyright     : Clément VITRAT
 */

/* Stockage du fichier dans un Package PJoueur avec tous les autres ex's */
package PJoueur;


public class Resultat {

    private Joueur joueur;
    private int score;

    /**
     * Création du constructeur
     * @param joueur
     * @param score
     */
    public Resultat(Joueur joueur, int score) {
        this.joueur = joueur;
        this.score = score;
    }

    /**
     * Permet d'afficher le Joueur et son résultat
     * @return nom, le nom du joueur
     * @return prenom, le prénom du joueur
     * @return pseudo, le pseudo du joueur
     * @return score, le score du joueur
     */
    public void afficher() {
        System.out.print("Joueur : " + this.joueur.nom + " " + this.joueur.prenom + " (" + this.joueur.pseudo + ")");
        System.out.print("Votre score est de " + this.score);
    }

    /**
     * Permet de retourner le score du joueur
     * @return score
     */
    public int getScore() {
        return this.score;
    }
}
