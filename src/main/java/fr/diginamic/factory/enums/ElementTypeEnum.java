package fr.diginamic.factory.enums;

public enum ElementTypeEnum {
    INGREDIENT("Ingredient", UniteEnum.MILI_GRAMMES), ALLERGENE("Allergène", UniteEnum.MILI_GRAMMES),
    ADDITIF("Additif", UniteEnum.MICRO_GRAMMES);

    /** le nom du type de l'element */
    private String nom;

    /** l'unite de l'element (milligramme, microgramme) */
    private UniteEnum unite;

    /** Constructeur */
    private ElementTypeEnum(String nom, UniteEnum unite) {
        this.nom = nom;
        this.unite = unite;
    }

    /** Getter pour le nom */
    public String getNom() {
        return nom;
    }

    /** Getter pour l'unite */
    public UniteEnum getUnite() {
        return unite;
    }
}
