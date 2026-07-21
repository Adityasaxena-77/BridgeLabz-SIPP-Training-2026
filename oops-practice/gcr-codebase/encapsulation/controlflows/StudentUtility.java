import java.util.*;
public class StudentUtility{
     public static void main(String[] args){
        Student s=new Student();
        int a=s.getID();
        System.out.println(a);
        s.setName("Aditya");
        String name=s.getName();
        System.out.println(name);
     }
}