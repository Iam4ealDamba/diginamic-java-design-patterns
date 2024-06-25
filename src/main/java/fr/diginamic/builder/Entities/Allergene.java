package fr.diginamic.builder.Entities;

public class Allergene {
    private String nom;
    private Double qteMiligrammes;

    public Allergene() {
        super();
    }

    public Allergene(String nom, Double qteMiligrammes) {
        this.nom = nom;
        this.qteMiligrammes = qteMiligrammes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getQteMiligrammes() {
        return qteMiligrammes;
    }

    public void setQteMiligrammes(Double qteMiligrammes) {
        this.qteMiligrammes = qteMiligrammes;
    }

    
}