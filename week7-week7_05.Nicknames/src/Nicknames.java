
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<String, String>();
        hmap.put("matti", "mage");
        hmap.put("mikael", "mixu");
        hmap.put("arto", "arppa");
        String trans = hmap.get("mikael");
        System.out.println(trans);
    }

}
