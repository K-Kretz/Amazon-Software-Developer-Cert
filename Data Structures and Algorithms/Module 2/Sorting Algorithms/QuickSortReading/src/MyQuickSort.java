public class MyQuickSort {
    static void quicksort(int[] numbers, int start, int end) {
        if(start<end)
        {
            int pivot = partition(numbers, start,end);

            quicksort(numbers,start,pivot-1);
            quicksort(numbers,pivot+1,end);
        }
    }

    private static int partition(int[] numbers, int start, int end) {

        int pivot = numbers[end];
        int i = start-1;

        for (int j = start; j<=end-1; j++)
        {
            if(numbers[j]< pivot)
            {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        i++;
        int temp = numbers[i];
        numbers[i] = numbers[end];
        numbers[end] = temp;

        return i;
    }
    public static void quicksortABC(String[] words, int start, int end) {
        if(start<end)
        {
            int pivot = partitionABC(words, start,end);

            quicksortABC(words,start,pivot-1);
            quicksortABC(words,pivot+1,end);
        }
    }

    private static int partitionABC(String[] words, int start, int end) {

        String pivot = words[end];
        int i = start-1;
        for (int j = start; j<=end-1; j++)
        {
            if(words[j].compareTo(pivot)<0)
            {
                i++;
                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
            }
        }
        i++;
        String temp = words[i];
        words[i] = words[end];
        words[end] = temp;

        return i;
    }


}
