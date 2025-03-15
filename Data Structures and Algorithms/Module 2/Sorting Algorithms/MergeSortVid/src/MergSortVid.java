public class MergSortVid {
    public static void sort(int[] numbers, int left, int right){
        if(numbers == null || numbers.length <=1)
        {
            return;
        }
        if(left<right)
        {
            int midPoint = left+(right-left)/2;
            sort(numbers,left,midPoint);
            sort(numbers,midPoint+1,right);

            merge(numbers,left,midPoint,right);

        }

    }

    private static void merge(int[] numbers, int left, int midPoint, int right) {
        int sizeLeft = midPoint-left+1;
        int sizeRight = right-midPoint;

        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        for(int index =0; index<sizeLeft; index++)
        {
            leftArray[index] = numbers[left+index];
        }
        for(int index =0; index<sizeRight; index++)
        {
            rightArray[index] = numbers[midPoint+1+index];
        }
        int indexOfLeftArray =0;
        int indexOfRightArray = 0;
        int indexOfMergedArray = left;

        while (indexOfLeftArray < sizeLeft && indexOfRightArray<sizeRight)
        {
            if(leftArray[indexOfLeftArray] <= rightArray[indexOfRightArray])
            {
                numbers[indexOfMergedArray] = leftArray[indexOfLeftArray];
                indexOfLeftArray++;
            }
            else{
                numbers[indexOfMergedArray] = rightArray[indexOfRightArray];
                indexOfRightArray++;
            }
            indexOfMergedArray++;
        }

        while(indexOfLeftArray<sizeLeft){
            numbers[indexOfMergedArray]=leftArray[indexOfLeftArray];
            indexOfLeftArray++;
            indexOfMergedArray++;
        }

        while(indexOfRightArray<sizeRight)
        {
            numbers[indexOfMergedArray] = rightArray[indexOfRightArray];
            indexOfRightArray++;
            indexOfMergedArray++;
        }
    }
}
