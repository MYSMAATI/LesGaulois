package lieux;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois;
	
	
	
	public Village(String nom, int nbVillageoisMaximum ) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageois = 0;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
		
	public String getNom() {
		return nom;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;		
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef.getNom() +
				"vivent les légendaires gaulois : \n");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " +villageois[i].getNom() + "\n");
		}
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30); 
		//il y a une erreur car les cases d'un tableau sont numéroté de 0 à n-1
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//il retourne null car gaulois est un objet
		Gaulois obelix = new Gaulois("Obélix", 35);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}

}
