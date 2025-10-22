package interfaces.interfacesExercise;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOff'");
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;

    public void achiveOrbit() {
        transition("Orbit achived");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achiveOrbit();
        transition("Data Collection while Orbiting");
    }
    public void transition(String descritpion) {
        System.out.println(descritpion);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {
    void achiveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }
    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }
    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nexStage = FlightEnabled.super.transition(stage);
        logStage(stage,  "Beginning transition to " + nexStage);
        return nexStage;
    }
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();

    abstract void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
        // System.out.println("transition not implemeted on " + this.getClass().getName());
        // return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
