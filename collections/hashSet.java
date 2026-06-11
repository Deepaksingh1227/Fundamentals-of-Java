package collections;

import java.util.*;

public class hashSet {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Deepak");
        hs.add("saurabh");
        hs.add("shiv");
        hs.add("jyoti");
        hs.add("deepak");
        hs.add("Deepak");

        System.out.println("getting all users from the set:");

        for (String role : hs) {
            System.out.println(role);
        }

    }

}
