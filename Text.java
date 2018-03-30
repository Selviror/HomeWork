package HW3A1;

public class Text {
    private String header;
    private String text = "";
 
    public Text(Prop prop) {
        header = prop.getValue();
    }
    public Text(Word word) {
        header = word.getValue();
    }
    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        text += " " + word.getValue();
    }

    public void addBody(Prop prop) {
        text += " " + prop.getValue();
    }

    public String getText() {
    return text;
    }
}
