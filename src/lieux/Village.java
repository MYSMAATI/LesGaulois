package lieux;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillagoies;
	
	
	
	public Village(String nom) {
		this.nom = nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
		
	public String getNom() {
		return nom;
	}

}
