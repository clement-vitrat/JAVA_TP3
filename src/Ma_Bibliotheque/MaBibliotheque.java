// Stockage du fichier dans un Package Ma_Bibliotheque
package Ma_Bibliotheque;
// Import du Package Scanner pour lire les entrees du clavier
import java.util.Scanner;
// Import du Package InputMismatchException pour traiter les entrées
import java.util.InputMismatchException;


// Programme qui permet de définir les différents classes de traitement de saisie
public class MaBibliotheque {

    // Programme pour traiter la saisie d'entier
    public static int SasieEntier(String texte)  {
        /**
         * Entrée :
         *    texte, message affiché pour interroger l'utilisateur
         * Action : Demande à l'utilisateur de saisir un entie et vérifie que la saisie est bien entier
         * Return : La valeur de l'entier saisie
         */

        // Déclaration des variables
        int saisie = 0;
        boolean ctrl = true;

        // Saisie et Contrôle
        do {                                                            // Faire
            ctrl = true;                                                    // Boolean de contrôle = Vraie
            System.out.print(texte);                                        // Affichage de la question par l'utilisateur
            Scanner input = new Scanner(System.in);                         // Création de la variable pour le Scanner
            try {                                                           // Contrôle
                saisie = input.nextInt();                                       // Saisie par l'utilisateur
            } catch (InputMismatchException e) {                            // Si Exception pas un entier
                System.out.print("\nERREUR, vous n'avez pas saisie un ENTIER\n"); // Affiche erreur et repose la question
                ctrl = false;                                                   // Boolean = Faux
            }                                                               // Fin Exception
        } while (!ctrl);                                                // Tant que Boolean est Vraie
        return saisie;                                                  // Renvoie la réponse
    }


    // Programme pour traiter la saisie d'entier
    public static int SaisieEntierLimite(String texte, int min, int max)  {
        /**
         * Entrée :
         *    texte, message affiché pour interroger l'utilisateur
         *    min, valeur minimum que l'on peut saisir
         *    max, valeur maximum que l'on peut saisir
         * Action :
         *    demande à l'utilisateur de saisir un entier
         *    et vérifie que la saisie est bien entier et dans les limites
         * Sortie : la valeur de l'entier saisie
         */

        // Déclaration des variables
        int saisie = 0;
        boolean ctrl = true;

        // Saisie et Contrôle
        do {                                                                // Faire
            ctrl = true;                                                        // Boolean de contrôle = Vraie
            System.out.print(texte);                                            // Affichage de la question par l'utilisateur
            Scanner input = new Scanner(System.in);                             // Création de la variable pour le Scanner
            try {                                                               // Contrôle
                saisie = input.nextInt();                                           // Saisie par l'utilisateur
                if (!(saisie >= min && saisie <= max)) {                            // Sinon Message
                    System.out.print("\nLa valeur que vous avez saisie est en dehors des limites\n");
                    ctrl = false;
                }                                                                   // Fin Sinon
            } catch (InputMismatchException e) {                                // Si Exception pas un entier
                System.out.print("\nERREUR, vous n'avez pas saisie un ENTIER\n");   // Affiche erreur et repose la question
                ctrl = false;                                                       // Boolean = Faux
            }                                                                   // Fin Exception
        } while (!ctrl);                                                    // Tant que Boolean est Vraie
        return saisie;                                                      // Renvoie la réponse
    }


    // Programme pour traiter la saisie d'un réel
    public static float SaisieReel(String texte)  {
        /**
         * Entrée :
         *    texte, message affiché pour interroger l'utilisateur
         * Action : Demande à l'utilisateur de saisir un entier et vérifie que la saisie est bien entier
         * Return : La valeur de l'entier saisie
         */

        // Déclaration des variables
        float saisie = 0;
        boolean ctrl = true;

        // Saisie et Contrôle
        do {                                                                    // Faire
            ctrl = true;                                                            // Boolean de contrôle = Vraie
            System.out.print(texte);                                                // Affichage de la question par l'utilisateur
            Scanner input = new Scanner(System.in);                                 // Création de la variable pour le Scanner
            try {                                                                   // Contrôle
                saisie = input.nextFloat();                                             // Saisie par l'utilisateur
            } catch (InputMismatchException e) {                                    // Si Exception pas un entier
                System.out.print("\nERREUR, vous n'avez pas saisie un nombre REEL\n");  // Affiche erreur et repose la question
                ctrl = false;                                                           // Boolean = Faux
            }                                                                       // Fin Exception
        } while (!ctrl);                                                        // Tant que Boolean est Vraie
        return saisie;                                                          // Renvoie la réponse
    }


    // Programme pour traiter la saisie d'un réel
    public static String SaisieTexte(String texte)  {
        /**
         * Entrée :
         *    texte, message affiché pour interroger l'utilisateur
         * Action : Demande à l'utilisateur de saisir un texte et vérifie que la saisie n'est pas nulle
         * Return : Le texte saisi
         */

        // Déclaration des variables
        String saisie = "";
        boolean ctrl = true;

        // Saisie et Contrôle
        do {                                                            // Faire
            ctrl = true;                                                    // Boolean de contrôle = Vraie
            System.out.print(texte);                                        // Affichage de la question par l'utilisateur
            Scanner input = new Scanner(System.in);                         // Création de la variable pour le Scanner
            try {                                                           // Contrôle
                saisie = input.next("[a-zA-Z]{2,}");                      // Saisie par l'utilisateur
            } catch (InputMismatchException e) {                            // Si Exception pas un texte
                System.out.print("ERREUR, saisie non conforme\n");            // Affiche erreur et repose la question
                ctrl = false;                                                   // Boolean = Faux
            }                                                               // Fin Exception
        } while (!(ctrl));                                              // Tant que Boolean est Vraie
        return saisie;                                                  // Renvoie la réponse
    }


    // Programme qui permet d'interroger l'utilisateur
    public static char oui_non(String message) {
        /**
         * Entrée :
         *    texte, message affiché pour interroger l'utilisateur
         * Action : Demande à l'utilisateur de saisir o ou n et vérifie la saisie
         * Return : O ou N
         */

        // Déclaration des variables
        char rep;
        boolean ctrl = true;

        // Rajoute Oui ou Non à la fin du texte de saisie
        message = message + "(O ou N) ? ";

        // Saisie et Contrôle
        do {                                             // Faire
            ctrl = true;                                    // Boolean de contrôle = Vraie
            System.out.print(message);                      // Affichage de la question par l'utilisateur
            Scanner input = new Scanner(System.in);         // Création de la variable pour le Scanner
            rep = input.next().charAt(0);                   // Saisie par l'utilisateur
            rep = Character.toUpperCase(rep);               // Transforme en Majuscule la saisie
            if (!(rep == 'O' || rep == 'N')) {              // Si rep différente de O ou N Faire
                ctrl = false;                                   // Boolean de contrôle = Faux
            }                                               // Fin de Si
        } while (!ctrl);                                 // Tant que Boolean est Vraie
        return rep;                                      // Renvoie la réponse
    }


    // Programme pour traiter l'attente
    public void attente() {
        /**
         * Action : Attends que l'utilisateur presse ENTRER
         */

        // Création de la variable pour le Scanner
        Scanner attentEntrer = new Scanner(System.in);
        // Message à l'utilisateur
        System.out.print("\nAppuyer sur ENTER pour continuer");
        // Ligne Suivante
        attentEntrer.nextLine();
    }
}

