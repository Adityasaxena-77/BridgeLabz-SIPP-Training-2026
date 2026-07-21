package UniversityGradeSystem;

public class Student extends Person{
    protected int StudentId;
    protected double StudentGpa;


    public Student(int id,String name, int StudentId, double StudentGpa) {
        super(id,name);
        this.StudentId = StudentId;
        this.StudentGpa = StudentGpa;

    }

    @Override
    public String toString(){
        return "Person{" +
                "personId = " + personId +
                "person Name = " + personName + '\'' +
                '}';
    }
}
