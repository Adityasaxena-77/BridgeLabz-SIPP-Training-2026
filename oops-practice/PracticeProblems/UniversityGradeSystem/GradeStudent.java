package UniversityGradeSystem;

public class GradeStudent extends Student {
    protected String thesis;

    public GradeStudent(int id,String name, int StudentId, double StudentGpa, String thesis){
        super(id, name, StudentId, StudentGpa);
        this.thesis = thesis;
    }

    @Override
    public String toString(){
        return "Person{" +
                "personId = " + personId +
                "person Name = " + personName + '\'' +
                '}';
    }
}
