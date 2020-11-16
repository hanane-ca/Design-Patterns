package observer;

public class Client {
	
	public static void main(String[] args) {

		Compteur compteur=new Compteur();
		compteur.setState(0);
		Observateur observateur=new Observateur();
		Binaire binaire = new Binaire();
		binaire.subscribe = false;
		Octal octal = new Octal();
		Hexadecimal hexa = new Hexadecimal();
		compteur.run();
		//binaire.toggleSubscribe();

		//Ajouter un observer	
		
		//binaire
		if(binaire.subscribe){
			compteur.addObserver(binaire);
		}else {
			compteur.deleteObserver(binaire);
		}

		//octal
		if(binaire.subscribe){
			compteur.addObserver(octal);
		}else {
			compteur.deleteObserver(octal);
		}

		//hexa
		if(binaire.subscribe){
			compteur.addObserver(hexa);
		}else {
			compteur.deleteObserver(hexa);
		}

		compteur.addObserver(observateur);
		
	}

}
