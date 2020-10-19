package singleton;

public class Terre {
	int age,population;
	
	private Terre(int age,int population) {
		this.age = age;
		this.population = population;
	};
	
	 /** Holder */
    private static class TerreHolder {       
        /** Instance unique non pr�initialis�e */
        private final static Terre instance = new Terre(1500,70);
    }
 
    /** Point d'acc�s pour l'instance unique du singleton */
    public static Terre creer() {
        return TerreHolder.instance;
    }
	
	
	void afficher() {
		System.out.println("la terre a " + age +" ans et sa population est estim� � " + population);
	}
	
	void ajouter(int n) {
		population += n;
	}
	 
	
}
