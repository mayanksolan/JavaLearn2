
import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private final ArrayList<ToBeStored> Things;

    public Box(double weight) {
        this.maxWeight = weight;
        this.Things = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored Thing : Things) {
            weight += Thing.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored Thing){
        if(weight() + Thing.weight() < this.maxWeight){
            Things.add(Thing);
        }
    }
    
    public String toString(){
        return "Box: " + Things.size() + " things, total weight " + weight() + " kg";
    }
}
