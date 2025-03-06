import java.util.TreeMap;
import java.util.Map;

 class TreeMapMain {
     public static void main(String[] args) throws Exception{
         TreeMap treeMap_1 = new TreeMap();

         treeMap_1.put("JOhn Wells","USA");
         treeMap_1.put("Ben Wells","Germany");
         treeMap_1.put("Kenny Wells","Mexico");
         treeMap_1.put("Alen Wells","Canada");

         printAll(treeMap_1);

         System.out.println();
         TreeMap treeMap_2 = new TreeMap(new LastNameComparator());

         treeMap_2.put("JOhn Wells","USA");
         treeMap_2.put("Ben Apple","Germany");
         treeMap_2.put("Kenny Johnson","Mexico");
         treeMap_2.put("Alen Wells","Canada");

         printAll(treeMap_2);

     }

     public static void printAll(TreeMap map){

         for(Object entry : map.entrySet()){
             Map.Entry thisEntry = (Map.Entry)entry;

             System.out.print(thisEntry.getKey() + " ");
             System.out.println(thisEntry.getValue());
         }
     }
 }
