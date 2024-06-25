package fr.diginamic.builder;

import fr.diginamic.builder.Entities.Additif;
import fr.diginamic.builder.Entities.Allergene;
import fr.diginamic.builder.Entities.Categorie;
import fr.diginamic.builder.Entities.Ingredient;
import fr.diginamic.builder.Entities.Marque;
import fr.diginamic.builder.Entities.Produit;

public class ProduitBuilder {
    Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder buildIngredient(String nom, Double qteMilligrammes) {
        if (qteMilligrammes == null) {
            return this;
        }

        Ingredient ingredient = new Ingredient(nom, qteMilligrammes);
        this.produit.getIngredients().add(ingredient);
        return this;
    }

    public ProduitBuilder buildMarque(String nom) {
        Marque marque = new Marque(nom);
        this.produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder buildCategorie(String nom) {
        Categorie categorie = new Categorie(nom);
        this.produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder buildAdditif(String nom, Double qteMiligrammes) {
        Additif additif = new Additif(nom, qteMiligrammes);
        this.produit.getAdditifs().add(additif);
        return this;
    }

    public ProduitBuilder buildAllergene(String nom, Double qteMiligrammes) {
        Allergene allergene = new Allergene(nom, qteMiligrammes);
        this.produit.getAllergenes().add(allergene);
        return this;
    }

    public Produit build() {
        return this.produit;
    }

}
