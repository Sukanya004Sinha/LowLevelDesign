package oops.classandobjects;
class Computer {
    public static void playMusic() {
        System.out.println("Play music");

    }

    public String getMePen(int cost) {
        if(cost>=10)
            return "pen";

                return "Nothing";


        }

    }


    public class Methods {

        public static void main(String[] args){
            Computer com = new Computer();
            Computer.playMusic();
            int i = 10;
            String str =  com.getMePen(110);
            System.out.println(str);
            


    }
}