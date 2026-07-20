package AddressBook;

public class Contacts implements Comparable<Contacts> {

    private String name;
    private String phoneNumber;
    private String email;

    public Contacts(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    

    @Override
    public int compareTo(Contacts c) {
        return this.name.compareTo(c.getName());
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}