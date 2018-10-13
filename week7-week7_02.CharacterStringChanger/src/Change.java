
public class Change {

    private char fromChar;
    private char toChar;

    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }

    public String change(String characterString) {
        String news = "";
        for (int i = 0; i < characterString.length(); i++) {
            char c = characterString.charAt(i);
            if (c == this.fromChar) {
                news += this.toChar;
            } else {
                news += c;
            }
        }
        return news;
    }
}
