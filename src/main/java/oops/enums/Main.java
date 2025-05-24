package oops.enums;

public class Main {
    public static void main(String[] args){
        /**
         * Common functions which can be used with enum
         * 1. values() - returns an array of all enum constants in the order they are declared.
         * 2. valueOf(String name) - returns the enum constant of the specified enum type with the specified name.
         * 3. ordinal() - returns the ordinal of this enumeration constant (its position in the enum declaration, where the initial constant is assigned an ordinal of zero).
         * 4. name() - returns the name of this enum constant, exactly as declared in its enum declaration.
         */
        //1. Usage of Values () and ordinal()
        for(EnumSample sample : EnumSample.values()) {
            System.out.println("Enum constant: " + sample + ", Ordinal: " + sample.ordinal());

        }
        //2. Usage of ValueOf() and name()
        EnumSample enumVariable = EnumSample.valueOf("SUNDAY");
        System.out.println("Enum constant from valueOf: " + enumVariable + ", Name: " + enumVariable.name());
    }
}
