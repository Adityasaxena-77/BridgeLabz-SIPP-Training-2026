package AdressBook;

public class Contacts implements Comparable<Contacts>{
     private String Name;
     private String PhoneNumber;
     private String Email;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
    @Override
    public int compareTo(Contacts c){
        return this.Name.compareToIgnoreCase(c.Name);
    }

    public Contacts(String name, String phoneNumber, String email) {
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
    }



}
