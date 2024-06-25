package fr.diginamic.factory.models;

import fr.diginamic.factory.enums.UniteEnum;

public class Element {
    String nom;
    Integer nbTotal;
    UniteEnum unite;

    public Element(String nom, Integer nbTotal, UniteEnum unite) {
        this.nom = nom;
        this.nbTotal = nbTotal;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNbTotal() {
        return nbTotal;
    }

    public UniteEnum getUnite() {
        return unite;
    }
}
