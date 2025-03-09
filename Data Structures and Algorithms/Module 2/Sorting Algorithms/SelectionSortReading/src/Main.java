public class Main {
    public static void main(String[] args) {
        int[] heightOfBooks = {29, 10, 14, 37, 13};
        selectionSort(heightOfBooks);

        System.out.print("Sorted heightOfBooks in ascending order: ");
        for (int number : heightOfBooks) {
            System.out.print(number + " ");
        }

        System.out.println();

        int[] testScores = {85, 92, 78, 96, 89, 73, 91};

        // Call the method to sort in descending order
        selectionSortDescending(testScores);

        // Print the sorted scores
        System.out.print("Test scores sorted in descending order: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = counter1;
            for (int counter2 = counter1 + 1; counter2 < n; counter2++) {
                if (arr[counter2] < arr[minIndex]) {
                    minIndex = counter2;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[counter1];
            arr[counter1] = temp;
        }
    }

    private static void  selectionSortDescending(int[] arr) {
        for(int key=0; key < arr.length-1; key++)
        {
            int minIndex = key;
            for(int keyNext=key+1; keyNext< arr.length; keyNext++)
            {
                if(arr[keyNext] > arr[minIndex])
                    minIndex=keyNext;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[key];
            arr[key] = temp;
        }
    }
}
