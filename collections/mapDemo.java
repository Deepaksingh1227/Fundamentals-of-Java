package collections;

import java.util.*;

public class mapDemo {
    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(001, "lalit");
        hm.put(002, "Aman");
        hm.put(003, "lucky");
        hm.put(004, "harikesh");

        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry);
        }

    }

}
