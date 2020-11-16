package observer;

import java.util.Observable;

public class Hexadecimal extends Observateur{
private String time;
	
	public void setTime(int time) {
		this.time = (Integer.toHexString(time)) ;
	}
	
	public String getTime() {
		return time;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		//if(o instanceof Compteur){
			this.setTime(((Compteur) o).getState());
			System.out.println("hexa : "+ getTime());
		//}
		
	}


}
