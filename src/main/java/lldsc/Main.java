package lldsc;

public class Main {
public static void main(String[] args){
    Student sukanya = new Student();
    sukanya.name= "Sukanya";
    sukanya.dob= "24/01";
    sukanya.name= "Sukku";
    sukanya.updateName("Sukanya Sinha");
    sukanya.printName();
    Instructor sukanyas = new Instructor();
    sukanyas.name = "Sukanya";
    sukanyas.dob= "03011999";
    sukanyas.gender= "Female";
    sukanyas.updateDoB("0304111");
    
    Human n = sukanya;
    n.updateDoB(("24011999"));
}
}
