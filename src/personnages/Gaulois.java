package personnages;

public class Gaulois {
	 private String nom; 
	 private int force; 
	 private int effetPotion;
	 public Gaulois(String nom, int force) { 
	 this.nom = nom; 
	 this.force = force; 
	 this.effetPotion = 1;
	 } 
	 
	 public String getNom() { 
	 return nom; 
	 } 
	 
	 public void parler(String texte) { 
	 System.out.println(prendreParole() + "« " + texte + "»"); 
	 } 
	 
	 private String prendreParole() { 
	 return "Le gaulois " + nom + " : "; 
	 } 
	 
	 public void frapper(Romain romain) { 
	 System.out.println(nom + " envoie un grand coup dans la mâchoire de " 
	 + romain.getNom()); 
	 romain.recevoirCoup((force / 3) * effetPotion); 
	 } 
	 
	 public void boirePotion(int potion) {
		 effetPotion = potion;
		 parler("Merci Druide, je sens que ma force est " 
		 + potion + " fois décuplée");
	 }
	 
	 @Override 
	 
	 public String toString() { 
	 return "Gaulois [nom=" + nom + ", force=" + force 
	 + ", effetPotion=" + effetPotion + "]"; 
	 } 
	 public static void main(String[] args) { 
	 //TODO créer un main permettant de tester la classe Gaulois 
	 } 
	

}
