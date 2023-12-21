package lldsc;

public class Instructor extends Human{
    void  updateDoB(String newDob){
        this.dob = newDob + "NEW";
    }
    void  doBlahBlah(){
        System.out.println("BLAH BLAH");
    }
}
