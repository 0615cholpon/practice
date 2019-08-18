package wednesdayRecap;

public class GroceryStore {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1.2, "yellow", "delicious", "medium");
        Apple apple2 = new Apple(2, "red", "sour", "small");
        Apple apple3 = new Apple(3, "green", "ok", "big");
        System.out.println("Your apple specs are: ");
        Apple[]apples = {apple1, apple2, apple3};
        int count = 1;
        for(int i = 0; i < apples.length; i++){
            System.out.println("========================");
            System.out.println("Apple #" + (count + i));
            System.out.println("Color\t: " + apples[i].color);
            System.out.println("Size\t: " + apples[i].size);
            System.out.println("Taste\t: " + apples[i].taste);
            System.out.println("Weight\t: " + apples[i].weight + " pounds");
        }


    }
}
