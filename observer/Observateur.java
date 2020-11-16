package observer;
import java.util.Observable;
import java.util.Observer;

public class Observateur implements Observer{
	private String time;
	boolean subscribe;

	boolean toggleSubscribe(){
		subscribe = !subscribe;
		return subscribe;
	}
	public String getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time =  Integer.toString(time);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setTime(((Compteur) o).getState());
		System.out.println("l'observateur : "+ getTime());
	}
}
