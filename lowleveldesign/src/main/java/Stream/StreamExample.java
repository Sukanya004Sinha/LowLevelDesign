package Stream;
import java.util.ArrayList;
import java.util.List;
public class StreamExample {
    public static void main(String[] args){
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3100);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);
        int count =0;
        for(Integer salary: salaryList){
            if(salary>3000){
                count++;
            }
        }
        System.out.println("Total Employee with salary > 3000 " +count);
        long output = salaryList.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println("Total Employee with salary > 3000 "+ output);
        int output1= (int) salaryList.stream().filter((Integer sal1)-> sal1 >4000).count();
        System.out.println("Total employee with salary > 4000 " + output1);
    }

}
