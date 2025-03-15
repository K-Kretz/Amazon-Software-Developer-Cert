import java.util.Random;

public class MyQuickSort {
    public static void quickSort(int[] array, int start, int end){
        if(end <=start) return; //base case

        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1); //left section of pivot
        quickSort(array,pivot+1,end); //right section of pivot
    }
    public static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start-1;

        for(int j = start; j <= end-1; j++)
        {
            if(array[j]< pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    //Random Pivot QuickSort
    public static void quickSortRandom(int[] array, int start, int end){
        if(end <=start) return; //base case

        int pivot = partitionRandom(array,start,end);
        quickSort(array,start,pivot-1); //left section of pivot
        quickSort(array,pivot+1,end); //right section of pivot
    }
    public static int partitionRandom(int[] array, int start, int end){
        Random rand = new Random();

        int randomPivotIndex = start+rand.nextInt(end-start+1);

        int temp = array[randomPivotIndex];
        array[randomPivotIndex] = array[end];
        array[end] = temp;

        return partition(array,start,end);
    }
    
    //Median of 3 QuickSort
    public static void quickSortMedian(int[] array, int start, int end){
        if(end <=start) return; //base case

        int pivot = partitionMedian(array,start,end);
        quickSort(array,start,pivot-1); //left section of pivot
        quickSort(array,pivot+1,end); //right section of pivot
    }
    public static int partitionMedian(int[] array, int start, int end){
        int pivot = medianOfThree(array,start,end);
        
        int i = start-1;
        
        for(int j=start; j<end; j++)
        {
            if(array[j]< pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    private static int medianOfThree(int[] array, int start, int end) {
        int mid = (end-start)/2;

        if(array[start] < array[mid] && array[mid]<array[end])
        {
            int temp = array[mid];
            array[mid] = array[end];
            array[end] = temp;
        }
        else if (array[start] > array[mid] && array[start]<array[end])
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        return array[end];
    }
}
