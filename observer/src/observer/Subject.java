package observer;

import java.util.Observable ;

@SuppressWarnings("deprecation")
public class Subject extends Observable implements Runnable {

    private int state;
    
    public Subject(int val) {
		this.setState(val);
	}

 public int getState() {
    return state;
 }

 public void setState(int state) {
	  this.state=state;
	  this.setChanged();
	  this.notifyObservers(state);
	  
 }
 
@Override
public void run() {
try {
		while (!Thread.currentThread().isInterrupted()) {
			this.setState((this.getState() + 1) % 60);
			Thread.sleep(2000);
		}
	} catch (InterruptedException e) {
	}
}


}
