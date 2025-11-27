package model;

public class ReservationSpectacle extends Reservation{
	int zone;
	int chaise;

	public ReservationSpectacle(int jour, int mois, int zone, int chaise) {
		super(jour, mois);
		this.zone = zone;
		this.chaise = chaise;
	}

	@Override
	public String toString() {
		return "Le " + getJour(jour) + "/" + getMois(mois) + "\nLa chaise nr° " + chaise + " dans la zone nr° " + zone + ".";
	}

}
