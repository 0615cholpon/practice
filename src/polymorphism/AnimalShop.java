package polymorphism;

public class AnimalShop {
    public static void main(String[] args) {
        Animal a = new Dog();
        // Animal, Dog, Object, Trainable & Huskey
        // Casting

        Dog d = (Dog)a;
        d.bite();
//        Husky h = (Husky)a;
//        h.sit(); // from top to bottom--> ClassCastException;

        Husky hh = new Husky();
        Animal aa = hh;
        // aa --> Animal --> Access to Animal class;
        // hh --> Husky --> Access to Husky class.

        Animal ad = (Animal)new Dog();

    }
}
