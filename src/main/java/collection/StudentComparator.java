package collection;
import java.util.Comparator;
public class StudentComparator {
    int rollno;
    String name;
    StudentComparator(int rollno, String name){
        this.rollno = rollno;
        this.name = name;

    }
}
class NameComparator implements Comparator<StudentComparator> {
    public int compare(StudentComparator s1, StudentComparator s2) {
        return s1.name.compareTo(s2.name);
    }

}
