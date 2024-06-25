package fr.diginamic.builder;

import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.builder.Entities.Produit;

public class ProduitBuilderTest {
    @Test
    public void testCreerProduitVide() {

        Produit builder = new ProduitBuilder().build();

        assertNotNull(builder);
    }

    @Test
    public void testCreerProduitAvecTroisIngredients() {

        Produit builder = new ProduitBuilder().buildIngredient("Farine", 100.0).buildIngredient("Sucre", 100.0)
                .buildIngredient("Lait", 100.0).build();

        assertNotNull(builder);

        assertEquals(3, builder.getIngredients().size());
    }

    @Test
    public void testCreerProduitAvecTroisAdditifs() {

        Produit builder = new ProduitBuilder().buildAdditif("Sodium Nitrite", 50.0)
                .buildAdditif("Potassium Sorbate", 150.0)
                .buildAdditif("Monosodium Glutamate", 10.0).build();

        assertNotNull(builder);

        assertEquals(3, builder.getAdditifs().size());
    }

    @Test
    public void testCreerProduitAvecTroisAllergenes() {

        Produit builder = new ProduitBuilder().buildAllergene("Gluten", 100.0).buildAllergene("Crustace", 100.0)
                .buildAllergene("Poisson", 100.0).build();

        assertNotNull(builder);

        assertEquals(3, builder.getAllergenes().size());
    }

    @Test
    public void testCreerProduitAvecMarque() {

        Produit builder = new ProduitBuilder().buildMarque("Coca Cola").build();

        assertNotNull(builder);

        assertNotNull(builder.getMarque());

        assertEquals("Coca Cola", builder.getMarque().getNom());
    }

    @Test
    public void testCreerProduitAvecCategorie() {

        Produit builder = new ProduitBuilder().buildCategorie("Boissons").build();

        assertNotNull(builder);

        assertNotNull(builder.getCategorie());

        assertEquals("Boissons", builder.getCategorie().getNom());
    }

    @Test
    public void testCreerProduitComplet() {

        Produit builder = new ProduitBuilder().buildIngredient("Farine", 100.0).buildIngredient("Sucre", 100.0)
                .buildIngredient("Lait", 100.0).buildMarque("Coca Cola").buildCategorie("Boissons")
                .buildAdditif("Sodium Nitrite", 50.0).buildAdditif("Potassium Sorbate", 150.0)
                .buildAdditif("Monosodium Glutamate", 10.0).buildAllergene("Gluten", 100.0)
                .buildAllergene("Crustace", 100.0).buildAllergene("Poisson", 100.0).build();

        assertNotNull(builder);

        assertEquals(3, builder.getIngredients().size());

        assertEquals(3, builder.getAdditifs().size());

        assertEquals(3, builder.getAllergenes().size());

        assertNotNull(builder.getMarque());

        assertNotNull(builder.getCategorie());

        assertEquals("Coca Cola", builder.getMarque().getNom());

        assertEquals("Boissons", builder.getCategorie().getNom());

    }

    @Test
    public void testErreurCreerProduit() {

        Produit builder = new ProduitBuilder().buildIngredient("Farine", null).buildIngredient("Sucre", null).build();

        assertNotNull(builder);

        assertEquals(2, builder.getIngredients().size());
    }
}
