package String;

public class Demo1 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Sukanya");
        sb.append(" Sinha");
        sb.deleteCharAt(2);
        sb.insert(2, "k");
        sb.substring(2,4);

        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
