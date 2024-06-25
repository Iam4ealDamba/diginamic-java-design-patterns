package fr.diginamic.factory.utils;

import fr.diginamic.factory.enums.ElementTypeEnum;
import fr.diginamic.factory.models.Additif;
import fr.diginamic.factory.models.Allergène;
import fr.diginamic.factory.models.Element;
import fr.diginamic.factory.models.Ingrédient;

public class Factory {
    public static Element createElement(ElementTypeEnum type, String nom, Integer nbTotal) {

        switch (type.getNom()) {
            case "Ingredient":
                return new Ingrédient(nom, nbTotal, type.getUnite());
            case "Allergène":
                return new Allergène(nom, nbTotal, type.getUnite());
            case "Additif":
                return new Additif(nom, nbTotal, type.getUnite());
            default:
                return null;
        }
    }
}
