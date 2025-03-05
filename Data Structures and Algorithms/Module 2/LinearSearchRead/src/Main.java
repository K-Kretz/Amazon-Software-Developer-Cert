import java.util.ArrayList;

public class Main {
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
}
    public static int[] findAllOccurrences(int[] arr, int target) {
        // TODO: Implement this method to return all indices where the target value is found
        // You might want to use a list to collect indices and then convert it to an array
        // Consider returning an empty array if the target value is not found
        ArrayList<Integer> indicesList = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            if(arr[i] == target){
                indicesList.add(arr[i]);
            }
        }

        int[] indicesArray = new int[indicesList.size()];
        for (int i = 0; i < indicesArray.length; i++) {
            indicesArray[i] = indicesList.get(i);
        }

        return indicesArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;


        int index = linearSearch(arr, target);


        if (index != -1) {
        System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }



            int[] arr1 = {10, 20, 30, 20, 50};
            int target1 = 20; // Value to search for

            int[] indices = findAllOccurrences(arr1, target1);
            System.out.print("Find All Occurrences: ");
            if (indices.length > 0) {
                for (int index1 : indices) {
                    System.out.print(index1 + " ");
                }
            } else {
                System.out.print("No occurrences found.");
            }
            System.out.println();
        }
    }
