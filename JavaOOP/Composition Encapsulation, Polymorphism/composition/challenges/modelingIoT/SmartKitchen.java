package composition.challenges.modelingIoT;

public class SmartKitchen {

    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        this.brewMaster = new CoffeMaker();
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        this.brewMaster.setHasWorkToDo(coffeeFlag);
        this.iceBox.setHasWorkToDo(fridgeFlag);
        this.dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork() {
        this.brewMaster.brewCoffe();
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
    }
}
class CoffeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffe() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffe");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}
class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing the dishes");
            hasWorkToDo = false;
        }
    }
}