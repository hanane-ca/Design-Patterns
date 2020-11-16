package observer;

import java.util.Observable;

public class Octal extends Observateur{
private int time;
	
	public void setTime(int time) {
		this.time = Integer.parseInt(Integer.toOctalString(time)) ;
	}
	
	public String getTime() {
		return  Integer.toString(time);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		//if(o instanceof Compteur){
			this.setTime(((Compteur) o).getState());
			System.out.println("octal : "+ getTime());
		//}
		
	}

}
