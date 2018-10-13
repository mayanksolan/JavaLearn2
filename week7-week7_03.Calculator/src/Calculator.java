
import java.util.ArrayList;

public class Calculator {

    private Reader reader;
    private int stats = 0;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {

        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                stats++;
            } else if (command.equals("difference")) {
                difference();
                stats++;
            } else if (command.equals("product")) {
                product();
                stats++;
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int val1 = this.reader.readInteger();
        System.out.print("value2: ");
        int val2 = this.reader.readInteger();
        System.out.println("sum of the values " + (val1 + val2));
    }

    private void difference() {
        System.out.print("value1: ");
        int val1 = this.reader.readInteger();
        System.out.print("value2: ");
        int val2 = this.reader.readInteger();
        System.out.println("difference of the values " + (val1 - val2));
    }

    private void product() {
        System.out.print("value1: ");
        int val1 = this.reader.readInteger();
        System.out.print("value2: ");
        int val2 = this.reader.readInteger();
        System.out.println("product of the values " + (val1 * val2));
    }

    private void statistics() {
        System.out.println("Calculations done " + this.stats);
    }

}
