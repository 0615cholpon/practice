package wednesdayRecap;

import java.util.*;

public class Drivers {
    public static void main(String[] args) {
        Set<String>cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Toyota");
        cars.add("Toyota");
        System.out.println(cars);
        List<String>carList = new ArrayList<>(cars);
        System.out.println(carList);
        System.out.println(carList.get(1));
        Collections.sort(carList);
        System.out.println(carList);




    }
}
