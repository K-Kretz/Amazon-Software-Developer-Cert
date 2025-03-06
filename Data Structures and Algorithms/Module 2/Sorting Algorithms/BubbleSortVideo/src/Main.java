public class Main {
    public static void main(String[] args) {
        int[] bookHeights = {12, 7, 19, 3, 15};

        BubbleSorting.printHeights(bookHeights);
        BubbleSorting.bubbleSort(bookHeights);
        BubbleSorting.printHeights(bookHeights);
    }
}
