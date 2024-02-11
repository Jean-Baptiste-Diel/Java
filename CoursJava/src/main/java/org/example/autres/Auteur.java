package org.example.autres;
/*
    Les classe,
 */
public class Auteur {
    // Ici je declare mes variable d'instance
    private String nom;
    private String prenom;
    private String edition;
    private int livre;

    // Ici c'est le constructeur de ma class, ici je dis ce que dois avoir ma class pour etre utiliser
    public Auteur(String nom, String prenom, String edition, int livre) {
        this.nom = nom;
        this.prenom = prenom;
        this.edition = edition;
        this.livre = livre;
    }

/*
    Je cree une methode pour  afficher les instance que je cree
    je cree mes instance dans la class Main ( voir ligne 46 )
 */
    public void afficher() {
        System.out.println("---Auteur---" + '\n' +
                "Nom: " + nom + '\n' +
                "Prenom: " + prenom + '\n' +
                "Edition: " + edition + '\n' +
                "Nombre livre: " + livre
                );
    }



}

