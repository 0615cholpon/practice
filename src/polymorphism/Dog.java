package polymorphism;

public class Dog extends Animal {

    public void bite(){
        System.out.println("Dog is biting!");
    }

    @Override
    public void makeNoise(){
        System.out.println("Dog is barking!");
    }



}
