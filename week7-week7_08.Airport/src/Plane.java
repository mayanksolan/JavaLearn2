
public class Plane {

    private String name;
    private int capacity;
    
    public Plane(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.capacity + " ppl)";
    }
}
