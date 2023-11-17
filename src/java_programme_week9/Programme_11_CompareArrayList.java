package java_programme_week9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("RED");
        c1.add("BLACK");
        c1.add("WHITE");
        c1.add("GREEN");
        c1.add("PINK");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("RED");
        c2.add("GREEN");
        c2.add("BLACK");
        c2.add("PINK");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for(String e : c1)
            c3.add(c2.contains(e) ? "yes": "No" );
        System.out.println(c3);
    }
}
