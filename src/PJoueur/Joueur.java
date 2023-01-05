/*
 * Nom de classe : Joueur
 * Description   : Cette classe crée un joueur et ses différentes caractéristiques
 * Version       : 1.0
 * Date          : 03/01/2022
 * Copyright     : Clément VITRAT
 */

/* Stockage du fichier dans un Package PJoueur avec tous les autres ex's */
package PJoueur;



public class Joueur {

    /* Création des différentes variables pour créer le joueur */
    private String nom;
    private String prenom;
    private String pseudo;

    /**
     * Création du constructeur
     * @param nom
     * @param prenom
     * @param pseudo
     */
    public Joueur(String nom, String prenom, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
    }

    /**
     * Permet d'afficher le Joueur
     * @return nom, le nom du Joueur
     * @return prenom, le prénom du Joueur
     * @return pseudo, le pseudo du Joueur
     */
    public void afficher() {
        System.out.print("Nom : " + this.nom);
        System.out.print("Prénom : " + this.prenom);
        System.out.print("Pseudo : " + this.pseudo);
    }

    /**
     * Permet de retourner le nom du Joueur
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Permet de retourner le prénom du Joueur
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Permet de retourner le pseudo du Joueur
     * @param pseudo
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
