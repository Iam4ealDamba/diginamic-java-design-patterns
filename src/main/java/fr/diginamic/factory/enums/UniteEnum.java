package fr.diginamic.factory.enums;

public enum UniteEnum {
    MICRO_GRAMMES(1000000), MILI_GRAMMES(1000);

    private int i;

    private UniteEnum(int i) {
        this.i = i;
    }
}
