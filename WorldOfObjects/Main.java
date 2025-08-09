package WorldOfObjects;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String[] spareParts = new String[] {"Tires", "Keys"};
        //Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});

        // nissan.make = "Nissan";
        // nissan.price = 10000;
        // nissan.year = 2020;
        // nissan.color = "Green";

        //Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});
        // dodge.make = "Dodge";
        // dodge.price = 11000;
        // dodge.year = 2019;
        // dodge.color = "Blue";

        // System.out.println("This " + nissan.make + " is worth $" + nissan.price +
        //         ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        // System.out.println("This " + dodge.make + " is worth $" + dodge.price +
        //         ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

        // nissan.setColor("Jet Black");
        // dodge.setColor("Jet Black");

        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);

        //spareParts[0] = "Filter";

        //Car nissan2 = new Car(nissan);

        //nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");

        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
        //         ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
        //         ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        //nissan2.drive();

        // System.out.println(nissan);
        // System.out.println(dodge);
        // System.out.println(nissan2);

        // Scanner scan = new Scanner(System.in);
        
        // Car[] cars = new Car[] {
        //     new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
        //     new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
        //     new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
        //     new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
        //     new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        // };
        
        // Dealership dealership = new Dealership(cars);
        

        // System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        // System.out.println("Feel free to browse through our collection of cars.\n");
        // System.out.println(dealership);
        // System.out.println("Which car are you interested in? (0 - 4).\n");
        // int index = scan.nextInt();

        // dealership.sell(index);

        // scan.close();


        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        Dealership dealership = new Dealership(cars);

        // Get a deep copy of the car at index 0
        Car carAtIndex0 = dealership.getCar(0);
        System.out.println("Original car make: " + carAtIndex0.getMake());

        // Modify the car's make
        carAtIndex0.setMake("Toyota");
        System.out.println("Modified car make: " + carAtIndex0.getMake());

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make: " + dealership.getCar(0).getMake());

        // Create a new Car object
        Car newCar = new Car("BMW", 10000, 2018, "silver", new String[] {"tires", "filter", "transmission"});

        // Set the car at index 1 in the dealership to a deep copy of the newCar
        dealership.setCar(1, newCar);

        // Verify that the car at index 1 in the dealership has been updated
        System.out.println("Dealership car make at index 1: " + dealership.getCar(1).getMake());

        // Modify the newCar object
        newCar.setMake("Audi");

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make at index 1 after modifying newCar: " + dealership.getCar(1).getMake());
    }
}
