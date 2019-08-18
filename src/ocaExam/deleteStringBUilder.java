package ocaExam;

import java.util.ArrayList;
import java.util.List;

public class deleteStringBUilder {
    private char var;
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello World");
//        System.out.println(sb.length());
//        sb.delete(0, sb.length());
//        System.out.println(sb.length());
//
//        char var = 'a';
//        char var1 = 'e';
//
//
//        deleteStringBUilder d1 = new deleteStringBUilder();
//        deleteStringBUilder d2 = d1;
//        d1.var = 'i';
//        d2.var = 'o';
//        System.out.println(var + ", " + var1);
//        System.out.print(d1.var + ", " + d2.var);
//
//        String ta = "A";
//        ta = ta.concat("B");
//        String tb = "C";
//        ta = ta.concat(tb);
//        ta = ta.replace('C', 'D');
//        ta = ta.concat(tb);
//        System.out.println(ta);

//        List<String> names = new ArrayList<>();
//        names.add("Robb");
//        names.add("Bran");
//        names.add("Rick");
//        names.add("Bran");
//        if(names.remove("Bran")){
//            names.remove("Rick");
//        }
//        System.out.println(names);
//        int[]numbers;
//        numbers = new int[2];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers = new int[4];
//        numbers [2] = 5;
//        numbers [3] = 6;
//       for(int x : numbers){
//           System.out.print(" " + x);
//       }

        ArrayList myList = new ArrayList();
        String[]myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }catch (RuntimeException re){
            System.out.println("Caught a Runtime Exception");
        }
        catch (Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("ready to use");



    }
}
