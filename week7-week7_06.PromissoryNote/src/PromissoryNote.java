
import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> hm;

    public PromissoryNote() {
        hm = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.hm.put(toWhom, value);

    }

    public double howMuchIsTheDebt(String whose) {
        if (hm.containsKey(whose)) {
            return hm.get(whose);
        } else {
            return 0;
        }
    }
}
