
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> newc;

    public Changer() {
        this.newc = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        newc.add(change);
    }
    
    public String change(String characterString) {
        for(Change c : newc){
            characterString = c.change(characterString);
        }
        return characterString;
    }
}
