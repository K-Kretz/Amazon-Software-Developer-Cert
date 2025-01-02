public class CookingCode{

    public double calculateIngredientQuantity(int servings, double originalQuantity){
        return servings * originalQuantity;
    }
    public void spiceUpDish(int spiceLevel) {
        switch(spicelevel)
        {
            case 1:
                System.out.println("For a level 1: add Cumin");
                break;
            case 2:
                System.out.println("For a level 2: add Cardamom");
                break;
            case 3:
                System.out.println("For a level 3: add Clove");
                break;
            case 4:
                System.out.println("For a level 4: add Turmeric");
                break;
            case 5:
                System.out.println("For a level 5: add Fennel");
                break;
            default:
                System.out.println("Error: please input a correct value next time");
        }
    }

    public void greetGuest(String name, String timeOfDay) {
        switch (timeOfDay)
        {
            case "morning":
                System.out.println("Good Morning: "+ name);
                break;
            case "afternoon":
                System.out.println("Good Afternoon: "+ name);
                break;
            case "evening":
                System.out.println("Good Evening: "+ name);
                break;
            default:
                System.out.println("Error: Please enter a valid time of day");
        }
    }
    static void main(String[] args) {
        double newQuantity = calculateIngredientQuantity(0, 0.0);
        spiceUpDish(0);
        greetGuest("guest", "time");

        double newQuantity = calculateIngredientQuantity(2, 3.5);
        spiceUpDish(3);
        greetGuest("guest", "afternoon");

    }
}

