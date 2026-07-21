public class Student extends Person{
    protected int studentId;
    protected double studentGpa;

    public Student (int id, String name,int studentId, double studentGpa){
        super(id, name);
        this.studentId=studentId;
        this.studentGpa=studentGpa;
    }
}