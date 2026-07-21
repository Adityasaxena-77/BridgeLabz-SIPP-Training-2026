package AdressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AdressBookData {
    static ArrayList<Contacts> contact=new ArrayList<>();
    static HashMap<String,Contacts> contactMap=new HashMap<>();
    static HashSet<String> phoneNumber=new HashSet<>();
    public void addContact(String name, String number, String Email){
        if(phoneNumber.contains(number)){
            System.out.println("USER ALREADY EXISTS!!!");
            return;
        }
        Contacts user=new Contacts(name, number,Email);
        contact.add(user);
        contactMap.put(name, user);
        phoneNumber.add(number);
        System.out.println("CONTACT ADDED SUCCESSFULLY");


    }

    public void search(String name){
        contactMap.get(name);
        Contacts c=contactMap.get(name);


        if(c!=null ){
            System.out.println(c);
        }else{
            System.out.println("Contact with name" + name + "not found");
        }

    }
    public void delete (String name){
        Contacts c=contactMap.get(name);
        if(c!=null){
            contactMap.remove(name);
            contact.remove(c);
            phoneNumber.remove(c.getPhoneNumber());
            System.out.println("Contacts has been deleted");
        }
        else{
            System.out.println("Contact with name" + name + "not found");
        }
    }
    public void display(){
        if(contact.isEmpty()){
            System.out.println("No contact found");
            return;
        }else{
            System.out.println("Contact list");
            Collections.sort(contact);
            for(Contacts c: contact){
                System.out.println(c);
            }
        }
    }
}
