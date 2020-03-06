import java.util.*;

public class ToFrenchMessage implements Observer{

	public ArrayList<String> messages = new ArrayList<String>();
	public HashMap<String, String> translations = new HashMap<String, String>();
	public ToFrenchMessage() {
		
	}
	public void update(ArrayList<String> messages) {
		
		this.messages = messages;
	}
	public void translate() {
		
		for(int i = 0; i < this.messages.size(); i++)
			if(i == this.messages.size() - 1) {
			
				String newMessage = new String();
				StringTokenizer tokenizer = new StringTokenizer(this.messages.get(i));
				int numberOfWords = tokenizer.countTokens();
				while(numberOfWords >= 1 ) {
					String currentWord = tokenizer.nextToken();
					if(this.translations.containsKey(currentWord))
						newMessage = newMessage + this.translations.get(currentWord) + " ";
					else
						newMessage = newMessage + currentWord + " ";
					numberOfWords --;
				}
				this.messages.remove(i);
				this.messages.add(newMessage);
			}
		System.out.println("S-a tradus mesajul primit in franceza");
	}
	public String toString() {
		
		return " --> observator franceza";
	}
}
