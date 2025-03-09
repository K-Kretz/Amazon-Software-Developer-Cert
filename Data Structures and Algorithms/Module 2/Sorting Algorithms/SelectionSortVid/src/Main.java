public class Main {
    public static void main(String[] args) {
        int[] coinSize = {15,25,30,20,10};

        System.out.println(coinSize);

        selectionSort(coinSize);
    }

    private static void selectionSort(int[] coinSize) {
        for(int key = 0; key< coinSize.length-1; key++)
        {
            int minIndex = key;

            for (int newKey = key+1; newKey< coinSize.length; newKey++)
            {
                if (coinSize[newKey] < coinSize[minIndex]){
                    minIndex=newKey;
                }
            }
            int temp = coinSize[minIndex];
            coinSize[minIndex] = coinSize[key];
            coinSize[key]=temp;
        }
    }


}
