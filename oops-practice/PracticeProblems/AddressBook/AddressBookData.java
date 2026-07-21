package AddressBook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBookData {
    
    static ArrayList<Contacts> contact=new ArrayList<>();
    static HashMap<String ,Contacts> contactMap=new HashMap<>();
    static HashSet<String> phoneNumber =new HashSet<>();


    public void add_contact(String name,String number,String email){
        if(phoneNumber.contains(number)){
            System.out.println("USER ALREDY EXIST!!!!");
            return;

        }
        Contacts user=new Contacts(name, number, email);
        contact.add(user);
        contactMap.put(name,user);
        phoneNumber.add(number);
        System.out.println("!!!!CONTACT ADDED SUCCESSFULLY!!!");
    }
    public void search(String name){
        Contacts c=contactMap.get(name);
         if(c!=null){
            
            System.out.println(c);
         }
         else{
            System.out.println("Contact with name"+name+"not found");
         }
         }
         public void delete(String name){
            Contacts c=contactMap.get(name);
            if(c!=null){
                contactMap.remove(name);
               contact.remove(c);
               phoneNumber.remove(c.getPhoneNumber());
               System.out.println("Contact has been deleted");
               
            }
            else{
                System.out.println("contact with name"+name+"not found");
            }
        }
            public void display(String name){
                Collections.sort(contact);
                for(Contacts contact:contact  ){
                    
                }
            }
         }






