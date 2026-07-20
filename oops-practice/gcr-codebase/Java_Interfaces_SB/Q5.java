interface LuggageScanner {

    void scanLuggage(String passenger);

    default void displaySecurityGuidelines() {
        System.out.println("Follow airport luggage security rules.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

interface PassportVerifier {

    void verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Carry your original passport.");
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    @Override
    public void scanLuggage(String passenger) {
        System.out.println(passenger + "'s luggage scanned.");
    }

    @Override
    public void verifyPassport(String passportNo) {
        System.out.println("Passport " + passportNo + " verified.");
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public static void main(String[] args) {

        String[] passengers = {
                "Aditya",
                "Rahul",
                "Priya"
        };

        String[] passports = {
                "A1234567",
                "B1234",
                "C9876543"
        };

        AirportSecuritySystem system = new AirportSecuritySystem();

        system.displaySecurityGuidelines();
        System.out.println();

        for (int i = 0; i < passengers.length; i++) {

            system.scanLuggage(passengers[i]);

            if (LuggageScanner.isPassportNumberValid(passports[i])) {
                system.verifyPassport(passports[i]);
                System.out.println(passengers[i] + " can board the flight.\n");
            } else {
                System.out.println(passengers[i] + " cannot board (Invalid Passport).\n");
            }
        }
    }
}