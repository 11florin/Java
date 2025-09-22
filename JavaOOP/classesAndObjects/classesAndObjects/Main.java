package classesAndObjects;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car();
        car.setMake("Dacia");
        car.setModel("Duster");
        car.setDoors(5);
        car.setConverible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model= " + car.getModel());
        car.describeCar();

        Car targa  = new Car();
        targa.setMake("porsche");
        targa.setModel("targa");
        targa.setDoors(5);
        targa.setConverible(true);
        targa.setColor("black");

        targa.describeCar();

    }
}