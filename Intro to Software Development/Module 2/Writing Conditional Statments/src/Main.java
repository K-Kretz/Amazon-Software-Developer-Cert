import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = keyboard.nextInt();

        System.out.println("Enter the Money to deposit: ");
        float depositMoney = keyboard.nextFloat();

        keyboard.nextLine();
        System.out.println("Enter the Name: ");
        String name = keyboard.nextLine();

        
    }
}