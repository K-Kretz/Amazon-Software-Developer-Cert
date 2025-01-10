public class Latte extends Coffee {

    String milkType;
    String syrupType;

    public Latte(String name, String roast, double price, String milkType, String syrupType) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupType = syrupType;

    }

    public void printLatteDetails(){

        System.out.println("Your latter has "+milkType+" and "+syrupType+" flavor." +
                " Your total bill is "+(price)+"$.");

    }
}
