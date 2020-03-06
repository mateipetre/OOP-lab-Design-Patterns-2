import java.util.*;

public class MessageSet implements Subject{

	public ArrayList<String> messages = new ArrayList<String>();
	private List<Observer> observers = new ArrayList<Observer>();
	public MessageSet() {
		
	}
	public void registerObserver(Observer o) {
		
		this.observers.add(o);
	}
	public void receiveMessage(String message) {
		
		this.messages.add(message);
		notifyObservers();
	}
	public void notifyObservers()  { 
		 
	    for (Iterator<Observer> it = observers.iterator(); it.hasNext();) { 
	    	
	          Observer o = it.next(); 
	          o.update(messages); 
	          System.out.println("S-a primit un mesaj nou" + o.toString());
	    } 
	 }
}
