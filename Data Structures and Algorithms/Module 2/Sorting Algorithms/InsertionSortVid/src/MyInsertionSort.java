public class MyInsertionSort {
    public static void printArray(int[] cards){
        for (int card : cards){
            System.out.print(card+" ");
        }
    }
    public static void insertionSort(int[] cards){
        for(int counter1 = 1; counter1 < cards.length; counter1++){
            int currentCard = cards[counter1];
            int counter2 = counter1 - 1;

            while(counter2 >= 0 && cards[counter2] > currentCard){
                cards[counter2+1] = cards[counter2];
                counter2--;
            }

            cards[counter2+1] = currentCard;
        }
    }
}
