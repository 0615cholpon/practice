package polymorphism;

public class Husky extends Dog implements Trainable{

    @Override
    public void sit() {
        System.out.println("Husky is sitting!");
    }

    @Override
    public void bring(String item) {
        System.out.println("Husky is bringing " + item);
    }

    @Override
    public void eat() {
        System.out.println("Husky is eating!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Husky is barking!");
    }
}
