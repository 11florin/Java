package inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    
    public Dog() {
        super("Matt", "Big", 50);
    }
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "\n" + super.toString() + "]";
    }
    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow, Wooooo!");
        }
        bark();
        System.out.println();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wig their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark() {
        System.out.print("Woof! ");
    }
    private void run() {
        System.out.print("Dog Running ");
    }
    private void walk() {
        System.out.print("Dog walking ");
    }
    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
    
}
