package exercise.codingExercise2;

public class Floor {
    
    private double width;
    private double length;
    
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        if (this.width < 0) {
            this.width = 0;
        }
        this.width = width;
    }
    public void setLength(double length) {
        if (this.length < 0) {
            this.length = 0;
        }
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
}
