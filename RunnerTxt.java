package HW3A1;

public class RunnerTxt {
	public static void main(String[] args) {
		Word word = new Word("Begining");
	    Text text = new Text(word);

	    Word word1 = new Word("Text");
	    Word word2 = new Word("was");
	    Word word3 = new Word("connected");

	    Prop prop = new Prop();
	    prop.addValue(word1);
	    prop.addValue(word2);
	    prop.addValue(word3);

	    text.addBody(prop);
	    
	    System.out.println("Text: "+text.getText());
	    System.out.println("Header: "+text.getHeader());
	    
	}
}
