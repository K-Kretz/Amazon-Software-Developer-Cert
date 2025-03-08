public class Main {
    public static void main(String[] args) {
        int[] card = {7,3,10,5,2};

        System.out.println("Initial hand of Cards");
        MyInsertionSort.printArray(card);

        MyInsertionSort.insertionSort(card);
        System.out.println("Hand of Cards after sort");
        MyInsertionSort.printArray(card);
    }
}
