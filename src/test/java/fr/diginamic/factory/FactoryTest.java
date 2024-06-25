package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.factory.enums.ElementTypeEnum;
import fr.diginamic.factory.enums.UniteEnum;
import fr.diginamic.factory.models.Element;
import fr.diginamic.factory.utils.Factory;

public class FactoryTest {
    @Test
    public void testCreerElementIngredient() {
        Element element = Factory.createElement(ElementTypeEnum.INGREDIENT, "Banane", 3);

        assertEquals("Le type devrait etre 'Ingrédient'", "Ingrédient", element.getClass().getSimpleName());
        assertEquals("Le nom de l'element doit etre 'Banane'", "Banane", element.getNom());
        assertEquals("Le prix de l'element doit etre '3'", Integer.valueOf(3), element.getNbTotal());
        assertEquals("L'unite de l'element doit etre 'MILI_GRAMMES'", UniteEnum.MILI_GRAMMES, element.getUnite());
    }

    @Test
    public void testCreerElementAllergene() {
        Element element = Factory.createElement(ElementTypeEnum.ALLERGENE, "Arachide", 15);

        assertEquals("Le type devrait etre 'Allergène'", "Allergène", element.getClass().getSimpleName());
        assertEquals("Le nom de l'element doit etre 'Arachide'", "Arachide", element.getNom());
        assertEquals("Le prix de l'element doit etre '15'", Integer.valueOf(15), element.getNbTotal());
        assertEquals("L'unite de l'element doit etre 'MILI_GRAMMES'", UniteEnum.MILI_GRAMMES, element.getUnite());
    }

    @Test
    public void testCreerElementAdditif() {
        Element element = Factory.createElement(ElementTypeEnum.ADDITIF, "E160a", 420);

        assertEquals("Le type devrait etre 'Additif'", "Additif", element.getClass().getSimpleName());
        assertEquals("Le nom de l'element doit etre 'E160a'", "E160a", element.getNom());
        assertEquals("Le prix de l'element doit etre '420'", Integer.valueOf(420), element.getNbTotal());
        assertEquals("L'unite de l'element doit etre 'MICRO_GRAMMES'", UniteEnum.MICRO_GRAMMES, element.getUnite());
    }

}
