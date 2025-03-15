public class Main {
    public static void main(String[] args) {
        int [] numbers = {38,27,43,3,9,82,10};
        MyQuickSort.quicksort(numbers,0,numbers.length-1);

        System.out.print("Sorted numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }



            String[] words = {"banana", "apple", "orange", "kiwi", "grape"};

            MyQuickSort.quicksortABC(words,0, words.length-1);

            System.out.print("Sorted numbers: ");
            for (String word : words) {
                System.out.print(word + " ");
            }
    }
}
