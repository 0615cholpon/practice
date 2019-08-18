package ocaExam;

public class IntegerF {
    public static void main(String[] args) {
        int i = 123456789;
        float f = i;
        //System.out.println(i - (int)f);

        doSum(10,20);
        doSum(10.0, 20.0);
    }

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum: " + (x + y));
    }

    public static void doSum(double x, double y){
        System.out.println("Double sum: " + (x + y));
    }

    public static void doSum(float x, float y){
        System.out.println("Float sum: " + (x + y));
    }

    public static void doSum(long x, long y){
        System.out.println("Long sum: " + (x + y));
    }




}
