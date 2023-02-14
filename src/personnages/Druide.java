package personnages;

import java.util.Random;

public class Druide {
	 private String nom; 
	 private int effetPotionMin; 
	 private int effetPotionMax; 
	 private int forcePotion;
	 public Druide(String nom, int effetPotionMin, int effetPotionMax, int effetPotion) { 
	 this.nom = nom; 
	 this.effetPotionMin = effetPotionMin; 
	 this.effetPotionMax = effetPotionMax;
	 this.forcePotion = 1;
	 parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller d'une force " + effetPotionMin + " à " 
	 + effetPotionMax + "."); 
	 } 
	 
	 public String getNom() { 
	 return nom; 
	 } 
	 
	 public void parler(String texte) { 
	 System.out.println(prendreParole() + "« " + texte + "»"); 
	 } 
	 
	 private String prendreParole() { 
	 return "Le druide " + nom + " : "; 
	 } 
	 
	 public int preparerPotion(int effetPotionMin, int effetPotionMax) {
		 Random random = new Random();
		 int potion;
		 potion = random.nextInt((effetPotionMax - effetPotionMin));
		 potion = potion + effetPotionMin;
		 
		 return potion;
	 }
	 
	 public void main() {
		 Druide panoramix = new Druide("Panoramix", 5, 10, 1);
		 panoramix.effetPotion = Druide.preparerPotion()
		 
	 }
}
