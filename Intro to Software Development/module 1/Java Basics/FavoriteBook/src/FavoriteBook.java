public class FavoriteBook {
    public static void main(String args[]) {


        String title = "Dracula";
        String writerName = "Bram Stoker";
        int totalPages = 223;
        double price = 19.99;

        System.out.printf(
                "Title:  %s%n" +
                "Author:  %s%n" +
                "Pages:  %d%n" +
                "Price: %.2f%n", title, writerName, totalPages, price);


    }
}