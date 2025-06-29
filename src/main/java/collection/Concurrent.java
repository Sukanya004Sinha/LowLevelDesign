package collection;

import java.util.ArrayList;
import java.util.List;

public class Concurrent {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Item " + i);
        }

        for (String item : list) {
            if (item.equals("Item 50")) {
                list.remove(item);
            }
        }
    }
}
