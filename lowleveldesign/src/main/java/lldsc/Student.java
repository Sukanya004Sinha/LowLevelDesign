package lldsc;

public class Student extends Human implements BatchChange{
    String name;
    String dob;
    int id;
    int coins;
    String gender;
    Student(){
        this.name="";
        dob="03011999";
        id=21;
    }
    void updateName(String newName){
        this.name = newName;
        super.name= newName + " Super";
    }
    void addCoins(int amount){
        this.coins+=amount;
    }
    void printName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    public void changeBatch(String newBatchName){
        System.out.println("Done");
    }
}
