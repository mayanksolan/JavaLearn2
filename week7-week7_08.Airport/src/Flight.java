
import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String origAir;
    private String destAir;

    public Flight(Plane plane, String origAir, String destAir) {
        this.plane = plane;
        this.origAir = origAir;
        this.destAir = destAir;
    }

    public String toString() {
        return this.plane + " (" + this.origAir + "-" + this.destAir + ")";
    }

}
