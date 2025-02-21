public class Main {
    public static void main(String[] args) {
        LinkedList waitList = new LinkedList();

        waitList.addFirstCustomer("Alice","Party of 5");

        waitList.addCustomer("Bob","Party of 3");
        waitList.addCustomer("Smitha","Party of 4");
        System.out.println(waitList);
        waitList.removeCustomer("Bob");
        System.out.println(waitList);
        waitList.addVIPCustomer("John", "PArty of 10");
        System.out.println(waitList);

    }
}
