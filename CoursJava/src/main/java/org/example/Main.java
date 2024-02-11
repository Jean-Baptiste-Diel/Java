package org.example;// Programme de mise a niveau Java.

import org.example.autres.Auteur;

import java.util.ArrayList;
import java.util.List;

// Tous programme java, se lance dans la fonction main
public class Main { // Le nom de la class doit etre le meme que celui du fichier
    public static void main(String[] args) { // Fonction principale du programme

        /*
            Les variable ( Une variable est un outil contenant une donnée )
         */

        int age = 18; // Declaration d'une variable entier
        double taille = 1.64; // Declaration d'une valeur reel ( a virgule )
        boolean disponible = false; // Declaration d'une variable boolean ( true ou false )
        String txtDispo; // Declaration d'une chaine de caractere

        /*
            Les constante
         */

        final String nom = "INANG"; // Declaration d'une constante il faut utiliser le mot final devant le type

        /*
            Les conditions
            Ici j'affiche un texte en fonction de la valeur de disponible
         */
        if (!disponible) // Ici je dis que si disponible est different de true, txtDispo recoit la valeur dans le else sinon elle prend celle du if
        {
            txtDispo = "vous etes actuellemnt disponible pour une balade";
        }else{
            txtDispo = "Oups vous n'etes pas disponible";
        }
        /*
            L'affichage
         */
        System.out.println(STR."Bonjour \{nom} votre age est de \{age} ans et vous faites \{taille} metre et \{txtDispo}"); // La fonction System.out.println() pour afficher du texte dans la console

        // Appel a la fonction addition
        int resultat = addition(15,1);
        System.out.println(resultat);

        // Appel a la fonction compte
        compte();

        // Ici je cree une instance de ma class Auteur
        System.out.println("Liste auteur");
        Auteur auteur1 = new Auteur("INANG", "Diel", "WP", 5);
        // Et je l'affiche
        auteur1.afficher();
        Auteur auteur2 = new Auteur("SIMBOU", "Lydie", "SSL", 3);
        // Et je l'affiche
        auteur2.afficher();

        tableau();
        liste();
    }

    /*
        Les fonctions ( methode )
        Une fonction est un bloc de code avec un nom, qui exécute un service.
         */
    public static int addition(int nombre1, int nombre2)
    {
        return nombre1 + nombre2;
    }

    /*
        la portee des variables
        En Java, on utiliser un des mots clés suivants pour désigner un niveau de contrôle :
        public : visible pour tous et par conséquent le moins restrictif ;
        protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;
        package-protected (protégé par paquet) : généralement visible uniquement par le package dans
     lequel il se trouve (paramètres par défaut). Ne pas mettre de mot clé déclenche ce niveau de contrôle ;
        private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies
     (à l'intérieur de la classe dans laquelle il est situé).
     */

    /*
        Les boucles
        Les itérations dans une boucle peuvent ignorer certaines instructions à l'intérieur de la boucle
      en utilisant la commande   continue  .
        Le cycle de boucle peut être interrompu et la boucle peut être interrompue prématurément à l'aide
      de la commande  break
     */
    public static void compte(){
        int i;
        int x = 0;
        int y = 0;
        /*
            Les boucles énumérées ( boucle for )
            Ici je fais une boucle qui commence a 0 et qui je termine lorsque i est egale a 3
         */
        for(i = 0; i < 3; i++ ){ // Initialisation
            System.out.println("Boucle for"); // Affichage
        }

        /*
            Les boucles conditionnelles ( boucles While et do...While )
         */
        while (x < 3){ // Initialisation
            System.out.println("Boucle while");
            x++;
        }
        // Pour la boucle do...while il faut d'abord dire se qu'il fait puis faire l'initialisation
        do {
            System.out.println("Boucle do...while");
            y++;
        }while (y < 3); // Initialisation
    }

    /*
        Les tableaux
     */
    public static void tableau(){
        String [] nomTab = new String[7]; // Declaration d'un tableau avec 7 cellule
        System.out.println(nomTab[2]); // Affichage de la cellule 2
        nomTab[4] = "Bonjour il est 06:28"; // Initialisation de la cellule 4
        System.out.println(nomTab[4]);
    }

    /*
        Les liste ordonnée
     */

    public static void liste(){
        List<String> myList = new ArrayList<>();
        // Ajouter des éléments à la liste
        myList.add("Anthony");
        myList.add("Diel");
        myList.add("Sarah");
        System.out.println(STR."Liste de base: \{myList}");
        // Accéder à un élément via son index
        String index = myList.get(1);
        System.out.println(STR."Element de 1: \{index}");
        // Ajouter un nouvel élément à la fin
        myList.add("Betine");
        System.out.println(STR."Apres avoir ajouter un element: \{myList}");
        // Insérer un nouvel élément à un index spécifique
        myList.add(2, "Rebecca");
        System.out.println(STR."Apres avoir inserer un element a un endroit specifiqu: \{myList}");
        // Supprimer un élément à un index spécifique
        myList.remove(1);
        System.out.println(STR."Apres avoir supprimer un element: \{myList}");
        System.out.println(STR."Liste mise ajoure: \{myList}");
    }
}