package AddressBook;

import java.util.Scanner;

public class AddressBookMain 
{
    
    public void choices(){
        AddressBookData addressBook=new AddressBookData();
        System.out.println("------------------------------------");
        System.out.println("Welcome to the AddressBook  Main Menu");
        while(true)
        {
        System.out.println("1.Add new Contact\n 2.Search Contact\n 3.Delete a Contact\n 4. Display Sorted Contacts\n 5.Exit");
        System.out.println("---------------------------------------");
        Scanner sc=new Scanner(System.in);
        int choices=sc.nextInt();
        if(choices==5)
            break;
        switch (choices) {
            case 1:
                System.out.println("Enter Contact name");
                String name=sc.next();
                System.out.println("ENter your 10 digit mobile number");
                String phonenumber=sc.next();
                System.out.println("Enter your email");
                String email=sc.next();
                addressBook.add_contact(name,phonenumber,email);
                break;
        
            case 2:
                System.out.println("Enter contact Name");
                name=sc.next();
                addressBook.search(name);
                break;

            case 3:
                System.out.println("Enter contact number");
                name=sc.next();
                addressBook.delete(name); 
                break;
                
             case 4: 
             name=sc.next();

                 addressBook.display(name);
                 break;
              default:
                System.out.println("Invalid choice");      
            }
        }
        System.out.println("------------------------------------------");
    }
      

        
    
    
 public static void main(String[] args) {
        AddressBookMain addressBookMain=new AddressBookMain();
        addressBookMain.choices();
    }
}
