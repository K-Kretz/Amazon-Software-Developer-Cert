public class Main {
    public static void main(String[] args) {

        String firstName ="Sandy";
        String lastName = "Jones";
        String movieTitle= "The Source Code";
        int numberOfTickets = 8;
        double priceOfTicket = 10.57;

        System.out.println(
                "First Name: "+ firstName +"\n" +
                        "Last Name: "+lastName+"\n" +
                        "Movie: "+movieTitle+"\n" +
                        "Number of Tickets: "+numberOfTickets+"\n" +
                        "Price per ticket in USD: "+priceOfTicket
        );

        double totalTicketPrice = numberOfTickets* priceOfTicket;

        System.out.println("Total Price of " +numberOfTickets+" tickets: " +totalTicketPrice);

        String username = firstName+lastName;
        System.out.println("Username: " + username);

        String movieName = movieTitle.toUpperCase();
        System.out.println("Movie: "+movieName);

        System.out.println(
                "Congratulations!! You have successfully booked the tickets\n" +
                        "\n" +
                        "Username: "+username+"\n" +
                        "Movie: "+movieName+"\n" +
                        "Number of Tickets: "+numberOfTickets+"\n" +
                        "Price per ticket: $"+priceOfTicket+"\n" +
                        "Total price of "+numberOfTickets+ " tickets: $"+totalTicketPrice+"\n" +
                        "\n" +
                        "Thank you for choosing us for booking your movie tickets\n" +
                        "Enjoy your movie!!!\n"
        );
    }
}