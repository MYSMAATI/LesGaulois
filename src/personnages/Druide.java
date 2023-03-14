package personnages;

import java.util.Random;

public class Druide {
	 private String nom; 
	 private int effetPotionMin; 
	 private int effetPotionMax;
	 private int effetPotion;
	 public Druide(String nom, int effetPotionMin, int effetPotionMax, int effetPotion) { 
	 this.nom = nom; 
	 this.effetPotionMin = effetPotionMin; 
	 this.effetPotionMax = effetPotionMax;
	 this.effetPotion = 1;
	 
	 parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller d'une force " + effetPotionMin + " à " 
	 + effetPotionMax + "."); 
	 } 
	 
	 public String getNom() { 
	 return nom; 
	 } 
	 
	 public int getEffetPotionMin() {
		 return effetPotionMin;
	 }
	 
	 public int getEffetPotionMax() {
		 return effetPotionMax;
	 }
	 
	 public void parler(String texte) { 
	 System.out.println(prendreParole() + "« " + texte + "»"); 
	 } 
	 
	 private String prendreParole() { 
	 return "Le druide " + nom + " : "; 
	 } 
	 
	 public void preparerPotion() {
		 Random random = new Random();
		 int potion;
		 potion = random.nextInt((effetPotionMax - effetPotionMin));
		 potion = potion + effetPotionMin;
		 effetPotion = potion;
		 if (potion > 7) {
			 parler(" J'ai  préparé une super potion de force " + potion);
		 }
		 else {
			 parler("Je n'ai pas trouvé tous les ingrédients, "
			 		+ "ma potion est seulement de force " + potion);
		 }
	 }
	 
	 public void booster(Gaulois gaulois) {
		 if ((gaulois.getNom()).equals("Obélix")) {
			 parler("Non Obélix, tu n'as pas besoin"
			 		+ " de potion magique");
		 }
		 else {
			 gaulois.boirePotion(effetPotion);
		 }
	 }
	 
	 public void main() {
		 Druide panoramix = new Druide("Panoramix", 5, 10, 1);
	 }
}
