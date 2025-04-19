package Tp2;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;

    public Livre(String titre, String auteur , int nbPages , double prix){
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = prix;
    }
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }
}
