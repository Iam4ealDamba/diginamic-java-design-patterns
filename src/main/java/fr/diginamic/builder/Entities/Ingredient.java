package fr.diginamic.builder.Entities;

public class Ingredient {
    private String nom;
    private Double qteMilligrammes;

    public Ingredient() {
        super();
    }

    public Ingredient(String nom, Double qteMilligrammes) {
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getQteMilligrammes() {
        return qteMilligrammes;
    }

    public void setQteMilligrammes(Double qteMilligrammes) {
        this.qteMilligrammes = qteMilligrammes;
    }

    
}
