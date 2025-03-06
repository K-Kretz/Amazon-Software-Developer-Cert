import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Example {
    public static void main(String[] args) {
        LinkedHashMap lm = new LinkedHashMap<>();

        lm.put("LY2302421", "John wells");
        lm.put("AB8394923", "Lori Wells");
        lm.put("AF3523425", "David Windston");

        printMap(lm);
        lm.put("AB8394923", "Corry Johnson");
        printMap(lm);

        //Get first and Last entries special to LinkedHashMap
        Map.Entry firstentry = (Map.Entry)lm.firstEntry();
        Map.Entry lastEntry = (Map.Entry)lm.lastEntry();
        System.out.println("First Entry: "+firstentry.toString());
        System.out.println("Last Entry: "+lastEntry.toString());

        //Remove entry from Collection
        String personRemoved = (String)lm.remove(firstentry.getKey());
        System.out.println("Removed: "+personRemoved);
        printMap(lm);

        //Put method Special for .putFirst() or .putLast()
        lm.putFirst("ge20230420","David Bean");
        printMap(lm);
    }

    public static void printMap(LinkedHashMap map){
        int i = 1;
        System.out.println("The waitList:");
        for(Object entryObject : map.entrySet())
        {
            Map.Entry entry = (Map.Entry) entryObject;

            System.out.println(i+" ID: "+entry.getValue() + ", name: "+ entry.getValue());
            i+=1;
        }
    }
}
