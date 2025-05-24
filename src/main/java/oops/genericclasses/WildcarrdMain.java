package oops.genericclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * WildCrdrds are used to represent an unknown type. example: List<? extends Number> is a list of unknown type that extends Number. example: List<Integer>, List<Float>, etc.
 * generic methods can be used to define a method that can accept different types of arguments. EXAMPLE: Number, Integer, Float, etc.
 */
public class WildcarrdMain {
    public static void main(String[] args){

        List<Integer> wildcardIntegerSourceList = new ArrayList<>();
        List<Float> wildCardFloatDestinationList = new ArrayList<>();
        WildCard printObj = new WildCard();
        printObj.computeList(wildcardIntegerSourceList, wildCardFloatDestinationList);
        //printObj.computeList1(wildcardIntegerSourceList, wildCardFloatDestinationList);
}

}