package singleton;

import singleton.Terre;

public class Client {
	
	public static void main(String[] args) {
		Terre terre = Terre.creer();
		Terre autre_terre = Terre.creer();
		
		autre_terre.afficher();

		terre.ajouter(100);
		
		autre_terre.afficher();


	}
	
	
}
