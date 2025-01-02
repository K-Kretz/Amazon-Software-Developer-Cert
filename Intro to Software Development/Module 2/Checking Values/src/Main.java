public class Main {
    public static void main(String[] args) {
        // the amount of spare money you have
        int dollarsToSpareInPocketToday = 300;

        // checking if interested in games based on luck
        boolean interestedInLuckAndFun = true;

        // checking if interested in history
        boolean interestedInHistory = false;

        // checking if the amount of money is less than 300
        if (dollarsToSpareInPocketToday < 300) {
            System.out.println("I will go to my parent’s place. No diversions.");
        }

        // checking if the amount of money is greater than 300 and interested in Luck
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == true && interestedInHistory == false) {
            System.out.println("I will go to Las Vegas.");
        }

        // checking if the amount of money is greater than 300 and interested in History
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == true) {
            System.out.println("I will visit Hoover Dam");
        }

        // checking if the amount of money is greater than 300 and not interested in Luck and not interested in history
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == false) {
            System.out.println("I will visit Area 51 and observe some aliens.");
        }
        if (!( (dollarsToSpareInPocketToday < 300)
                || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == true && interestedInHistory == false )
                || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == true)
                || (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == false)
        )) {
            System.out.println("Not a valid option.");
        }
    }
}