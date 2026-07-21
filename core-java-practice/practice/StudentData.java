//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class StudentData {
//    int ID;
//    String Name;
//    int Marks;
//
//    public StudentData(int id, String name, int marks) {
//        this.ID = id;
//        this.Name = name;
//        this.Marks = marks;
//    }
//
//    public StudentData() {
//    }
//
//    @Override
//    public String toString() {
//        return "Student{ " +
//                "ID=" + ID +
//                ", Name='" + Name + '\'' +
//                ", Marks=" + Marks +
//                " }";
//    }
//
//    public void addStudentData() {
//        try (Scanner sc = new Scanner(System.in);
//             FileWriter writer = new FileWriter("Student.txt", true)) {
//
//            System.out.println("Enter your Id");
//            int id = sc.nextInt();
//            sc.nextLine();
//
//            System.out.println("Enter your Name");
//            String name = sc.nextLine();
//
//            System.out.println("Enter your marks");
//            String marksInput = sc.nextLine().trim();
//            if (marksInput.endsWith("%")) {
//                marksInput = marksInput.substring(0, marksInput.length() - 1).trim();
//            }
//
//            int marks;
//            try {
//                marks = Integer.parseInt(marksInput);
//                Scanner sc=new Scanenr(System.in);
//                System.out.println("Enter a name");
//                String name=sc.nextLine();
//                BufferReader reader=new BufferReader(new FileReader("Student.txt"));
//
//
//                while(line=reader.readerLine()!=null){
//
//                }
//
//            }
//
//
//            catch (NumberFormatException ex) {
//                System.err.println("Invalid marks value: please enter a number like 97 or 97%.");
//                return;
//            }
//
//            writer.write("ID=" + id + ", Name=" + name + ", Marks=" + marks + System.lineSeparator());
//            System.out.println("Student Added Successfully");
//
//        } catch (IOException e) {
//            System.err.println("Failed to write student data: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//    public
//
//    public static void main(String[] args) {
//        StudentData data = new StudentData();
//        data.addStudentData();
//    }
//}
