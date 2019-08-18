package wednesdayRecap;

public class CarApp {

    public static void main(String[] args) {
        Vehicle hatchback = new Vehicle();
        hatchback.year = 1994;
        hatchback.brand = "Subaru";
        hatchback.model = "Legacy";
        hatchback.miles = 170000;
        hatchback.price = 4000;

        Vehicle suv = new Vehicle();
        suv.year = 2018;
        suv.model = "RX 350";
        suv.brand = "Lexus";
        suv.miles = 5;
        suv.price = 5000;


        Vehicle sedan = new Vehicle();
        sedan.year = 2000;
        sedan.model = "Camry";
        sedan.brand = "Toyota";
        sedan.miles = 2000;
        sedan.price = 3000;

        Vehicle truck = new Vehicle();
        truck.year = 2007;
        truck.model = "Toyota Hilux";
        truck.brand = "Toyota";
        truck.miles = 25000;
        truck.price = 3400;

        Vehicle[]vehicles = {hatchback, suv, sedan,truck};

        System.out.println("All vehicles in the lot:");
        for(int i = 0; i < vehicles.length; i++){
            System.out.println("-----------------------");
            System.out.println("Brand\t: " + vehicles[i].brand);
            System.out.println("Year\t: " + vehicles[i].year);
            System.out.println("Miles\t: " + vehicles[i].miles);
            System.out.println("Model\t: " + vehicles[i].model);
            System.out.println("Price\t: " + vehicles[i].price);
        }








    }
}
