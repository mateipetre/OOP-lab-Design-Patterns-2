
public class MessageTesting {

	public MessageTesting() {
		
	}

	public static void main(String[] args) {
		
		MessageSet messageSet = new MessageSet();
		ToEnglishMessage englishMessage = new ToEnglishMessage();
		ToFrenchMessage frenchMessage = new ToFrenchMessage();
	    ToItalianMessage italianMessage = new ToItalianMessage();
		messageSet.registerObserver(englishMessage);
		messageSet.registerObserver(frenchMessage);
		messageSet.registerObserver(italianMessage);
		englishMessage.translations.put("baiat", "boy");
		englishMessage.translations.put("copil", "child");
		englishMessage.translations.put("portocala", "orange");
		englishMessage.translations.put("mar", "apple");
		englishMessage.translations.put("calculator", "computer");
		frenchMessage.translations.put("baiat", "garcon");
		frenchMessage.translations.put("copil", "enfant");
		frenchMessage.translations.put("portocala", "orange");
		italianMessage.translations.put("baiat", "ragazzo");
		italianMessage.translations.put("copil", "bambino");
		italianMessage.translations.put("portocala", "arancione");
		messageSet.receiveMessage("copil se joaca la calculator");
		englishMessage.translate();
		messageSet.receiveMessage("baiat are portocala");
		frenchMessage.translate();
		messageSet.receiveMessage("baiat este copil");
		italianMessage.translate();
		for(int i = 0; i < messageSet.messages.size(); i++)
			System.out.println(messageSet.messages.get(i));
	}

}
