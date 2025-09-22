package exercise;

public class Main {
    
    public static void main(String[] args) {

        Dog rex = new Dog("rex");  // create instance (rex)
        Dog fluffy = new Dog("fluffy");  // create instance (fluffy)

        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy

    }
}
