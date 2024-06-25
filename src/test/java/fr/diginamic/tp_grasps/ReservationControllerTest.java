package fr.diginamic.tp_grasps;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.tp_grasps.beans.Reservation;

public class ReservationControllerTest {

	/** DELTA */
	private static final double DELTA = 0.0000001;

	@Test
	public void testCreerReservationTheatrePremium() {

		Params params = new Params("1", 3, "20/11/2020 19:55:00", "TH");

		ReservationController controller = new ReservationController();
		Reservation reservation = controller.creerReservation(params);

		assertEquals(382.5, reservation.getTotal(), DELTA);
	}

	@Test
	public void testCreerReservationTheatreNonPremium() {

		Params params = new Params("3", 3, "20/11/2020 19:55:00", "TH");

		ReservationController controller = new ReservationController();
		Reservation reservation = controller.creerReservation(params);

		assertEquals(450.0, reservation.getTotal(), DELTA);
	}

	@Test
	public void testCreerReservationCinemaPremium() {

		Params params = new Params("2", 4, "21/11/2020 20:30:00", "CI");

		ReservationController controller = new ReservationController();
		Reservation reservation = controller.creerReservation(params);

		assertEquals(43.6, reservation.getTotal(), DELTA);
	}

	@Test
	public void testCreerReservationCinemaNonPremium() {

		Params params = new Params("3", 4, "21/11/2020 20:30:00", "CI");

		ReservationController controller = new ReservationController();
		Reservation reservation = controller.creerReservation(params);

		assertEquals(43.6, reservation.getTotal(), DELTA);
	}

}
