package fr.diginamic.builder.Entities;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    /** le nom */
    private String nom;

    /** le grade */
    private String grade;

    /** la marque */
    private Marque marque;

    /** la categorie */
    private Categorie categorie;

    /** la liste des additifs */
    private List<Additif> additifs = new ArrayList<>();

    /** la liste des ingredients */
    private List<Ingredient> ingredients = new ArrayList<>();

    /** la liste des allergenes */
    private List<Allergene> allergenes = new ArrayList<>();

    /** Constructeur vide */
    public Produit() {
        super();
    }

    /** Constructeur avec nom et grade */
    public Produit(String nom, String grade) {
        this.nom = nom;
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

}
