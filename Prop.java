package HW3A1;

public class Prop {
	private String value = "";
	public void addValue(Word word) {
		value += " " + word.getValue();
	}

	public String getValue() {
		return value;
	}
}
