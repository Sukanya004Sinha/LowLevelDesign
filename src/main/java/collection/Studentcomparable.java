package collection;

public class Studentcomparable implements Comparable<Studentcomparable>{
    String name;
    int rollno;

    Studentcomparable() {
}
public  Studentcomparable(String name, int rollno){
    this.name = name;
    this.rollno = rollno;
}
@Override
    public int compareTo(Studentcomparable student){
    return  this.rollno - student.rollno;
}
}
