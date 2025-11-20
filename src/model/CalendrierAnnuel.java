package model;

import java.util.Iterator;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel(int jour, int mois) {
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
		return false;
	}
	
	public boolean reserver(int jour, int mois) {
		return false;
	}
	
	//classe interne
	private class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;	
			this.jours = new boolean[nbJours];
			for(int i=0; i<nbJours; i++) {
				jours[i] = true;
			}
		}
		
		private boolean estLibre(int jour) {
			if(jours[jour]==false) {
				return false;
			}
			return true;
		}
		
		private void reserver(int jour) {
			
			if(jours[jour] == )			
		}
		
		
	}

}
