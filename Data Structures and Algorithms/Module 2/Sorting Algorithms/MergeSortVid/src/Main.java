public class Main {
    public static void main(String[] args) {
        int[] numbers = {234,32,53,67,233,7,43,5,2,2,1};

        MergSortVid.sort(numbers,0, numbers.length-1);
        for (int number : numbers)
        {
            System.out.print(number+" ");
        }
    }
}
