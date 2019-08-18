package polymorphism;

import MentoringTasks.Array;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        //Flower fl = new Flower("Rose");
        // fl.color = "red";
        // Reference type of the <f> is Flower.
        // Object type of the <f> is Flower.

        //fl.grow();


        ///////USING IT TO TEST HUSKY--> DOG ---> ANIMAL

       Trainable husky = new Husky(); //checks reference type has
                                  // bite method NOT object type
//        husky.bite();
//        husky.eat();
//        husky.makeNoise();
//        husky.bring("remote control");
//        husky.sit();
//
//        ((Dog)husky).bite();
//
        ArrayList<Animal> animals = new ArrayList<>();
        Animal a1 = new Dog();
        Cat c = new Cat();
        Husky h1 = new Husky();
        animals.add(a1);
        animals.add(c);
        animals.add(h1);

        for (Animal a: animals) {
            a.makeNoise();

        }

    }
}
