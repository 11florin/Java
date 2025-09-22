package classesAndObjects;
public class Car {
    
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    

    // public Car(String make, String model, String color, int doors, boolean convertible) {
    //     this.make = make;
    //     this.model = model;
    //     this.color = color;
    //     this.doors = doors;
    //     this.convertible = convertible; 
    // }
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return  this.model;
    }
    public String getColor() {
        return this.color;
    }
    public int getDoors() {
        return this.doors;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsuported";
            }
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setConverible(boolean convertible) {
        this.convertible= convertible;
    }
    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
