package Stream;
/** Lambda expressions only works  with the functional interface **/
interface AB{
    int add(int i, int j);
}
public class Demo1 {
    public static void main(String[] args){
        AB obj = ( i , j) ->  i+j;
        int result=obj.add (6 , 7);
        System.out.println("Result is " +result);
    }
}
