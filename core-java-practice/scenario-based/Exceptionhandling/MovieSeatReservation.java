/**
 * Movie Seat Reservation System
 * Scenario: Handle array out-of-bounds exceptions when accessing seat numbers
 * 
 * Seats: int seats[] = {101,102,103,104,105};
 * Customer requests seat at position 8 (invalid)
 * 
 * Task:
 * - Create getSeat(int index) method
 * - Handle invalid access inside method
 * - Return -1 when exception occurs
 */

public class MovieSeatReservation {
    
    private int[] seats = {101, 102, 103, 104, 105};
    private boolean[] isBooked = {false, false, false, false, false};
    
    /**
     * Get seat number at given index
     * Returns seat number if valid
     * Returns -1 if index is out of bounds
     * 
     * @param index - Position of seat in array
     * @return Seat number or -1 if invalid
     */
    public int getSeat(int index) {
        try {
            // Check for negative index
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ Seat index cannot be negative. Index: " + index
                );
            }
            
            // Try to access the seat
            // If index is out of bounds, exception will be thrown automatically
            int seatNumber = seats[index];
            System.out.println("✓ Seat found - Seat Number: " + seatNumber + " at position " + index);
            return seatNumber;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Invalid seat position!");
            System.out.println("   Requested index: " + index);
            System.out.println("   Valid range: 0 to " + (seats.length - 1));
            System.out.println("⚠ Please choose a seat between 1 and " + seats.length);
            return -1; // Return -1 to indicate error
        }
    }
    
    /**
     * Book a specific seat
     * 
     * @param index - Seat position to book
     * @return true if booking successful, false otherwise
     */
    public boolean bookSeat(int index) {
        System.out.println("\n--- Booking Request ---");
        
        try {
            // Validate index
            if (index < 0 || index >= seats.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ Seat index out of valid range!"
                );
            }
            
            // Check if already booked
            if (isBooked[index]) {
                System.out.println("❌ Seat #" + seats[index] + " is already booked!");
                return false;
            }
            
            // Book the seat
            isBooked[index] = true;
            System.out.println("✓ Booking successful!");
            System.out.println("✓ Seat #" + seats[index] + " has been booked.");
            return true;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Cannot book seat - " + e.getMessage());
            System.out.println("⚠ Invalid seat position. Valid positions: 0 to " + (seats.length - 1));
            return false;
        }
    }
    
    /**
     * Check seat availability
     * 
     * @param index - Seat position to check
     * @return true if available, false if booked or invalid
     */
    public boolean isSeatAvailable(int index) {
        try {
            if (index < 0 || index >= seats.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ Invalid seat position: " + index
                );
            }
            
            boolean available = !isBooked[index];
            String status = available ? "Available ✓" : "Booked ✗";
            System.out.println("Seat #" + seats[index] + " - Status: " + status);
            return available;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /**
     * Display all available seats
     */
    public void displayAvailableSeats() {
        System.out.println("\n--- Available Seats ---");
        boolean hasAvailable = false;
        
        for (int i = 0; i < seats.length; i++) {
            try {
                if (!isBooked[i]) {
                    System.out.println("Position " + i + " -> Seat #" + seats[i]);
                    hasAvailable = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("❌ Error accessing seat at position " + i);
            }
        }
        
        if (!hasAvailable) {
            System.out.println("No seats available. All seats are booked!");
        }
    }
    
    /**
     * Display all seats with their status
     */
    public void displayAllSeats() {
        System.out.println("\n--- All Seats Status ---");
        for (int i = 0; i < seats.length; i++) {
            try {
                String status = isBooked[i] ? "BOOKED ✗" : "AVAILABLE ✓";
                System.out.println("Position " + i + " -> Seat #" + seats[i] + " - " + status);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Position " + i + " -> ERROR");
            }
        }
    }
    
    /**
     * Main method to test the system
     */
    public static void main(String[] args) {
        System.out.println("========== MOVIE SEAT RESERVATION ==========\n");
        
        MovieSeatReservation reservation = new MovieSeatReservation();
        
        // Display initial state
        reservation.displayAllSeats();
        
        // Test Case 1: Valid seat request
        System.out.println("\n--- TEST 1: Request Valid Seat (Position 0) ---");
        int seat = reservation.getSeat(0);
        System.out.println("Returned value: " + seat);
        
        // Test Case 2: Invalid seat request (out of bounds - position 8)
        System.out.println("\n--- TEST 2: Request Invalid Seat (Position 8) ---");
        seat = reservation.getSeat(8);
        System.out.println("Returned value: " + seat);
        
        // Test Case 3: Negative seat request
        System.out.println("\n--- TEST 3: Request Negative Seat (Position -1) ---");
        seat = reservation.getSeat(-1);
        System.out.println("Returned value: " + seat);
        
        // Test Case 4: Book valid seat
        System.out.println("\n--- TEST 4: Book Seat at Position 0 ---");
        reservation.bookSeat(0);
        
        // Test Case 5: Try to book already booked seat
        System.out.println("\n--- TEST 5: Try to Book Already Booked Seat (Position 0) ---");
        reservation.bookSeat(0);
        
        // Test Case 6: Book another valid seat
        System.out.println("\n--- TEST 6: Book Seat at Position 2 ---");
        reservation.bookSeat(2);
        
        // Test Case 7: Book seat with invalid position
        System.out.println("\n--- TEST 7: Try to Book Seat at Position 10 ---");
        reservation.bookSeat(10);
        
        // Test Case 8: Check availability
        System.out.println("\n--- TEST 8: Check Seat Availability ---");
        System.out.println("Position 1:");
        reservation.isSeatAvailable(1);
        System.out.println("\nPosition 0 (already booked):");
        reservation.isSeatAvailable(0);
        System.out.println("\nPosition 99 (invalid):");
        reservation.isSeatAvailable(99);
        
        // Display available seats
        reservation.displayAvailableSeats();
        
        // Final display
        reservation.displayAllSeats();
    }
}
