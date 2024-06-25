package fr.diginamic.factory.models;

import fr.diginamic.factory.enums.UniteEnum;

public class Allergène extends Element {

    public Allergène(String nom, Integer nbTotal, UniteEnum unite) {
        super(nom, nbTotal, unite);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Allergie : " + nom + " (" + nbTotal + " " + unite + ")";
    }

}
