
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Artosmo");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        for (int i = 0; i < 3; i++) {
            if (i == 1 && length % 2 == 0) {
                System.out.print(":) " + characterString + " :)");
            } else if (i == 1 && length % 2 != 0) {
                System.out.print(":) " + characterString + "  :)");
            } else if (length % 2 == 0) {
                for (int j = 0; j < (length / 2) + 3; j++) {
                    System.out.print(":)");
                }
            } else {
                for (int j = 0; j < (length / 2) + 4; j++) {
                    System.out.print(":)");
                }
            }
            System.out.println();
        }
        
    }
}

