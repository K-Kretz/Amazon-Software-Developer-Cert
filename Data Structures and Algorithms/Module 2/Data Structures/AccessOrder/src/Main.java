import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AccessOrderMap map = new AccessOrderMap(4);

        map.put("1", new Student("1", "John", "Wells", "English"));
        map.put("2", new Student("2", "Zina", "Wells", "English"));
        map.put("3", new Student("3", "David", "Windston", "English"));
        map.put("4", new Student("4", "Antonio", "Rodriguez", "Spanish"));


        for(Object entry : map.entrySet()){
        Map.Entry thisEntry = (Map.Entry)entry;
            System.out.println(thisEntry.getValue());
        }

        Student s3 = (Student)map.get("3");
        System.out.println();

        for(Object entry : map.entrySet()){
            Map.Entry thisEntry = (Map.Entry)entry;
            System.out.println(thisEntry.getValue());
        }

        map.put("5", new Student("5", "ken", "Wendle", "Italian"));
        System.out.println();

        for(Object entry : map.entrySet()){
            Map.Entry thisEntry = (Map.Entry)entry;
            System.out.println(thisEntry.getValue());
        }
    }
}
