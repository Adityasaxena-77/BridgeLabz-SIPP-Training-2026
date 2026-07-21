package level_2;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;


    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
        this.seatNumber = "Not Assigned";
        this.isBooked = false;
    }


    public void bookTicket(String seatNumber, double finalPrice) {
        if (isBooked) {
            System.out.println("Warning: Seat is already booked for this ticket!");
            return;
        }
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            System.out.println("Error: Invalid seat number.");
            return;
        }
        if (finalPrice < 0) {
            System.out.println("Error: Price cannot be negative.");
            return;
        }

        this.seatNumber = seatNumber;
        this.price = finalPrice;
        this.isBooked = true;
        System.out.printf("Ticket successfully booked for '%s' at seat %s for $%.2f.\n", movieName, seatNumber, finalPrice);
    }


    public void displayTicketDetails() {
        System.out.println("+----------------------------------------+");
        System.out.println("|             MOVIE TICKET               |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| Movie Name  : %-24s |\n", movieName);
        System.out.printf("| Seat Number : %-24s |\n", seatNumber);
        System.out.printf("| Price       : $%-23.2f |\n", price);
        System.out.printf("| Status      : %-24s |\n", isBooked ? "BOOKED" : "AVAILABLE");
        System.out.println("+----------------------------------------+");
        System.out.println();
    }


    public String getMovieName() {
        return movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        System.out.println("=== Running Movie Ticket Booking Simulation ===\n");


        MovieTicket ticket = new MovieTicket("Inception", 12.00);


        System.out.println("--- Ticket State Before Booking ---");
        ticket.displayTicketDetails();


        System.out.println("--- Performing Ticket Booking ---");
        ticket.bookTicket("H-14", 15.50);
        System.out.println();


        System.out.println("--- Ticket State After Booking ---");
        ticket.displayTicketDetails();


        System.out.println("--- Attempting Duplicate Booking ---");
        ticket.bookTicket("H-15", 15.50);
    }
}
