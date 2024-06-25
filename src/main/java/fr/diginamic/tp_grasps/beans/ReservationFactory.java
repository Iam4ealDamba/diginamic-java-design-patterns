package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

public class ReservationFactory {
    public static Reservation getInstance(Client client, LocalDateTime date, int nbPlaces) {
        Reservation reservation = new Reservation(date);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        return reservation;
    }

}
