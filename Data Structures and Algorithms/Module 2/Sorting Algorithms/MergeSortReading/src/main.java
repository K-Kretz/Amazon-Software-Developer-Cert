public class main {
    public static void main(String[] args) {
        int[] array = {38,27,43,3,9,82,10};
        sort.sort(array, 0,array.length-1);
        System.out.println("Sorted Array");
        for(int number : array)
        {
            System.out.print(number+" ");
        }
    }
}
