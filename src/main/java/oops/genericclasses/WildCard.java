package oops.genericclasses;

import java.util.List;

public class WildCard {
    //wild card methods

    public void computeList(List<? extends Number> source, List<? extends Number> destination) {
    }


//Generic type methods

    public <T extends Number> void computeList1(List<T> source, List<T> destination) {

    }
/**
 *
 */
}