
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dict;

    public Dictionary() {
        dict = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> al = new ArrayList<String>();
        for (String key : this.dict.keySet()) {
            al.add(key + " = " + this.dict.get(key));
        }
        return al;
    }
}
