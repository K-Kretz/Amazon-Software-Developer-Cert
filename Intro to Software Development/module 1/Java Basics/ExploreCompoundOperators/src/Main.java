public class Main {
    public static void main(String[] args) {
        int itemsAvailable = 7;

        System.out.println("Current available items : " + itemsAvailable);

        // Adding 10 more items
        itemsAvailable += 10;

        System.out.println("Total available items after adding: " + itemsAvailable);

        // Subtracting 9 items
        itemsAvailable -= 9;

        System.out.println("Total available items after subtracting: " + itemsAvailable);

        double amount = 100;

        double exchangeRateUSDToEUR = 0.85;

        System.out.println("Initial amount in USD: "+amount+" USD");
        amount *= exchangeRateUSDToEUR;
        System.out.println("Amount in EUR: "+amount+" EUR");
        amount-=55;
        System.out.println("Amount in EUR after expenditure: "+amount+" EUR");
        amount /= exchangeRateUSDToEUR;
        System.out.printf("Amount in USD: %.2f USD", amount);
    }
}