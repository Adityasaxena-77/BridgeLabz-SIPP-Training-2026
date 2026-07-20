package Collection;
public class StudentData implements Comparable<StudentData> {
    int id;
    String StudentName;
    int age;
    String Branch;
    public Object name;

    public StudentData(int id, String name, int age, String branch) {
        this.id = id;
        this.StudentName = name;
        this.age = age;
        this.Branch = branch;
    }

    @Override
    public String toString(){
        System.out.println("-----------------------------");
        return "ID : "+ id+ "\nName : "+ StudentName+ "\nAge : "+ age+  "\nBranch : "+ Branch;
    }

    @Override
    public int compareTo(StudentData t){
        return this.age-t.age;
    }

}