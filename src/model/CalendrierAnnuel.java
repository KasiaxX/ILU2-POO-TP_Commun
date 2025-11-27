package model;

import java.util.Iterator;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Février", 30);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Août", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Décembre", 31);
			
	}
	
	public boolean estLibre(int jour, int mois) {

		return calendrier[mois-1].estLibre(jour-1); // le jour est libre dans le mois

	}
	
	public boolean reserver(int jour, int mois) {
		
		if(estLibre(jour,mois)) {
			calendrier[mois-1].reserver(jour-1);
			return true;
		}
		
		return false;
	}
	
	//classe interne
	private class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++) {
				jours[i] = true;
			}
		}

		private boolean estLibre(int jour) {
			if (jours[jour] == false) {
				return false;
			}
			return true; // le jour est libre
		}

		private void reserver(int jour) {
			jours[jour] = false;
		}

	}

}
