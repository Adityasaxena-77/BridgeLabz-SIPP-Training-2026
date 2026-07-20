package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class StudentMain {
    public static void main(String[] args) {
        StudentData s1 = new StudentData(101, "Aditya", 27, "CSE");
        StudentData s2 = new StudentData(102, "Anubhav", 28, "IT");
        StudentData s3 = new StudentData(103, "Shivansh", 29, "Diploma");
        StudentData s4 = new StudentData(104, "lulla", 30, "MECH");
        StudentData s5 = new StudentData(105, "Samay", 31, "Civil");

        ArrayList<StudentData> list = new ArrayList<StudentData>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list, new SortByAge());
        Collections.sort(list, new SortByID());


        TreeSet<StudentData> treeList = new TreeSet<>();
        treeList.add(s1);
        treeList.add(s2);
        treeList.add(s3);
        treeList.add(s4);
        treeList.add(s5);

        for(StudentData s : treeList){
            System.out.println(s);
        }

        

        //Print all data from database
        // for(StudentData s: list){
        //     System.out.println(s);
        //     System.out.println("-------------------------");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name to find data: ");
        // String name = sc.nextLine();

        //Removing specific person data
        // int count=0;
        // for(StudentData s: list){
        //   if(s.StudentName.equalsIgnoreCase(name)){
        //     list.remove(count);
        //     break;
        //   }
        //   else{
        //     System.out.println("Student Not Found!");
        //   }
        //   count++;
        // }
        //Print specific person data:
//         int count=0;
//         String newname="";
//         for(StudentData s: list){
//           if(s.StudentName.length()>count){
//             count= s.StudentName.length();
//             newname= s.StudentName;
//           }
//         }
//         System.out.println(name);
//         for(StudentData s:list){
//         if(s.StudentName.equalsIgnoreCase(newname)){
//           System.out.println(newname);
//         }
//         }
    }
}