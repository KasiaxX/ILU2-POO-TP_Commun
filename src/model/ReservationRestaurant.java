package model;

public class ReservationRestaurant extends Reservation{
	int service;
	int table;

	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour, mois);
		this.service = service;
		this.table = table;
	}

	@Override
	public String toString() {
		String serviceString;
		if(service == 1) {
			serviceString = "premier";		
		}else {
			serviceString = "deuxième";
		}
		return "Le " + getJour(jour) + "/" + getMois(mois) + "\nTable " + table + " pour le " + serviceString + " service."; 
	}

}
