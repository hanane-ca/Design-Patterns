package observer;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Function;


public class Compteur extends Observable {
	Timer timer = new Timer();
	private int time;
	
	int getState(){
		return time;	
	}
	
	public void setState(int t){
		time = t;
		System.out.println("Le temps affiché par le compteur est "+ getState());

		setChanged();
		notifyObservers(this.time);		
	}
	
	public void run() {
		timer.schedule(new TimerTask() {
			public void run() {
				setState((getState()+1)%60);
				System.out.println("****************");
			}
		}, 0,1000);
		}
}
