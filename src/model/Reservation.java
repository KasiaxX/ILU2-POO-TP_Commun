package model;

public abstract class Reservation {
	int jour;
	int mois;
	
	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
		
	}
	
	public int getJour(int jour) {
		return jour;
	}
	
	public int getMois(int mois) {
		return mois;
	}
	
	public abstract String toString();
}
