package observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new Subject(0);
		subject.setState(2);
		BinaryObserver binary = new BinaryObserver(subject);
		OctalObserver octal = new OctalObserver(subject);
		Thread thread = new Thread(subject);
		thread.start();
		
	}

}

