package Collection;
import java.util.Comparator;
public class SortByID implements Comparator<StudentData> {
    @Override
    public int compare(StudentData s1, StudentData s2){
        return s1.id-s2.id;
    }
}
