package observer;

import java.util.Observer;
import java.util.Observable;


@SuppressWarnings("deprecation")
public class Observateur implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update called with Arguments");
		
	}

	}