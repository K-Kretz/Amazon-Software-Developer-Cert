public class BubbleSorting {

    public static void printHeights(int[] heights){
        for(int height : heights){
            System.out.println(height + "cm");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] bookheight){
        int numberOfBooks = bookheight.length;
        boolean swapped;

        for(int counter1 =0; counter1<numberOfBooks-1; counter1++)
        {
            swapped = false;
            for(int counter2 = 0; counter2 < numberOfBooks-1-counter1; counter2++)
            {
                if(bookheight[counter2] > bookheight[counter2+1]){
                    int temp = bookheight[counter2];
                    bookheight[counter2] = bookheight[counter2+1];
                    bookheight[counter2+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
