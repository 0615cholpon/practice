package wednesdayRecap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("James");
        names.add("Cholpon");
        names.add("Albina");
        System.out.println(names);

        Iterator<String>nameIterator = names.iterator();
//        System.out.println(nameIterator.next());
//        nameIterator.next();
//        nameIterator.next();
//
//        System.out.println(nameIterator.next());

        while ((nameIterator.hasNext())){
           // System.out.println(nameIterator.next());
            if(nameIterator.next().equals("Cholpon")){
                nameIterator.remove();
            }
           }
        System.out.println(names);
    }
}
