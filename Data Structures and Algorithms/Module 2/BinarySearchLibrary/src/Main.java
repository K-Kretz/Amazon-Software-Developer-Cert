public class Main {
    public static void main(String[] args) {
        BinarySearchBooks bsb = new BinarySearchBooks();
        int[] myArray = {1,4,6,9,10,12,14,16,21,25,35,46,56,78,90,100};

        int target =14;
        System.out.println(bsb.bSearch(myArray,target));
    }
}
