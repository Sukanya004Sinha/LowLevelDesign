package Array;
class Student{
    int rollno;
    String name;
    int marks;
}
public class ObjectArray {
    public static void main(String[] args) {
        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int n : nums) {
            System.out.println(n);
        }
        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks = 100;
        s1.name = "Sukanya";
        Student s2 = new Student();
        s2.rollno = 2;
        s2.marks = 200;
        s2.name = "Sparm";
        Student s3 = new Student();
        s3.rollno = 3;
        s3.marks = 300;
        s3.name = "Virat";
        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + "");
            System.out.println(s[i].name +" : " + s[i].rollno + ": " + s[i].marks);
        }
        for (Student st : s) {
            System.out.println(st.name + " : " + st.rollno + " : " + st.marks);
        }
    }
}
