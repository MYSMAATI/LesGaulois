package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chef;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Ob�lix le giga chad", 999999);
		Romain minus = new Romain("Minus", 8);
		Druide panoramix = new Druide("Panoramix", 5, 10, 1);
		
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par turbo B�l�nos, ce n'est pas juste");
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		//

	}

}
