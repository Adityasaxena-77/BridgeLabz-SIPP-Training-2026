package AdressBook;

import java.util.Scanner;

public class AdressBookMain {
    public void choices(){
        AdressBookData addressBook=new AdressBookData();
        System.out.println("-------------------------------------");
        System.out.println("Welcome to the AddressBook Main Menu");
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("1.Add new Contact\n2.Search Contact\n3.Delete a Contact\n4.Display Sorted Contacts\n5.Exit ");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==5)
            break;
        switch(choice){
            case 1:
                System.out.println("Enter contact Name:");
                String name=sc.nextLine();
                System.out.println("Enter your 10 digit phone Number");
                String phoneNumber=sc.nextLine();
                System.out.println("Enter your Email Address");
                String emailAddress=sc.nextLine();
                addressBook.addContact(name, phoneNumber, emailAddress);
                break;
            case 2 :
                System.out.println("Enter your name:");
                name=sc.nextLine();
                addressBook.search(name);
                break;
            case 3 :
                   System.out.println("Enter your contact name");
                   name=sc.nextLine();
                   addressBook.delete(name);
                   break;
            case 4:
                  addressBook.display();
                  break;
            default:
                 System.out.println("Invalid Choice");

        }
    }
        System.out.println("--------------------------------------------------------");
}
public static void main(String[] args){
        AdressBookMain addressBook=new AdressBookMain();
        addressBook.choices();
    }
}
