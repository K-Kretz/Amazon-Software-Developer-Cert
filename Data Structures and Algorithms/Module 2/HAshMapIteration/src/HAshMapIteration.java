import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HAshMapIteration {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("LY2048303", "John Wells");
        map.put("AB0649858", "Lori Wells");
        map.put("AB4453455", "David Windston");
        map.put("CS9857859", "John Smith");
        map.put("LY9475958", "Alen Cornworth");

        System.out.println();

        Set<String> keys = map.keySet();
        //or for(String key : map.keySets())
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("ID: " + key + ", NAME: " + value);
        }
        System.out.println();

        Set entries = map.entrySet();
        for (Object entry : entries) {
            Map.Entry mapEntry = (Map.Entry) entry;
            Object key = mapEntry.getKey();
            Object value = mapEntry.getValue();
            System.out.println("ID: " + key + ", NAME: " + value);
        }

    }
}
