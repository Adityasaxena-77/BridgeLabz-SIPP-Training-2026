package Collection;
import java.util.Comparator;
public class SortByAge implements Comparator<StudentData>{
    @Override
    public int compare(StudentData s1, StudentData s2){
        //return s1.age - s2.age;
        return s1.StudentName.compareTo(s2.StudentName);
    }
}
