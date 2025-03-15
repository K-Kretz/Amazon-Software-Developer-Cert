public class Main {
    public static void main(String[] args) {
        int[] array = {1,6,3,8,3,33,6633,22,64,3,2,7,33,26,21};

        MyQuickSort.quickSort(array,0,array.length-1);

        for (int num : array)
        {
            System.out.print(num+" ");
        }
    }
}
