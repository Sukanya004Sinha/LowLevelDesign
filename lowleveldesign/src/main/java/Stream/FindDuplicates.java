package Stream;

import java.util.*;
import java.util.stream.*;

public class FindDuplicates {
    public static void main(String[] args){
        int[] arr = {10, 2, 2, 3, 5, 11, 3 ,12, 11};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> findDup = Arrays.stream(arr).filter(i-> !seen.add(i)).boxed().collect(Collectors.toSet());
        System.out.println(findDup);

    }
}
