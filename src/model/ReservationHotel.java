package model;

public class ReservationHotel extends Reservation{
	int litsSimple = 0;
	int litsDoubles = 0;
	int chambre;

	public ReservationHotel(int jour, int mois, int litsSimple, int litsDoubles, int chambre) {
		super(jour, mois);
		this.litsSimple = litsSimple;
		this.litsDoubles = litsDoubles;
		this.chambre = chambre;	
	}

	@Override
	public String toString() {
		return "Le " + getJour(jour) + "/" + getMois(mois) + "\nChambre nr° " + chambre + " avec " 
	+ litsSimple + " lits Simples et " + litsDoubles + " lits Doubles.";
	}
	

}
