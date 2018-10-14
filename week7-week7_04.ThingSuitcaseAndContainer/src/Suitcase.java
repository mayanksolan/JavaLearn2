
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;
    //private int totWeight;
    //private int totThing;

    public Suitcase(int maxWeight) {
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
        //this.totWeight = 0;
        //this.totThing = 0;
    }

    public void addThing(Thing thing) {
        int weight = totalWeight();
        weight += thing.getWeight();
        if (weight <= this.maxWeight) {
            things.add(thing);
        }
    }

    public String toString() {
        int weight = totalWeight();
        switch (things.size()) {
            case 0:
                return "empty (" + weight + " kg)";
            case 1:
                return things.size() + " thing (" + weight + " kg)";
            default:
                return things.size() + " things (" + weight + " kg)";
        }
    }

    public void printThings() {
        for (Thing t : things) {
            System.out.println(t.toString());
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        int maxWeight = 0;
        if (!things.isEmpty()) {
            for (Thing t : things) {
                if (t.getWeight() > maxWeight) {
                    maxWeight = t.getWeight();
                }
            }
            for (Thing t : things) {
                if (maxWeight == t.getWeight()) {
                    return t;
                }
            }
        } else {
            return null;
        }
        return null;
    }
}
