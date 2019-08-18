package mockInterview;

public class PrivateConstructor {
    String name;
    int age;
    String location;

    private PrivateConstructor(){

    }
    private PrivateConstructor(String name){
        this.name = name;
        System.out.println("in argument constructor");
    }
    public static void a(String name){
        PrivateConstructor t = new PrivateConstructor(name);

    }


    public static void main(String[] args) {
         PrivateConstructor.a("Cholpon");

    }



}
