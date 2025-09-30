public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function name: greet
     * 
     * Inside the function: 
     * 1. prints: "hi"
     * 
     */
    public static void greet() {
        System.out.println("Hi");
    }
    /**
     * 
     * Function name: printText 
     * 
     * 
     * @param name (String)
     * @param age (String)
     * 
     * Inside the function:
     * 1. prints name and age
     */

    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and i'm " + age + " years old");
    }

    /**
     * 
     *  Function name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Inside the Function:
     * 1. Calculate the area and returns it
     */
    public static double calculateAria(double length, double width) {
        double area = length * width;
        return area;
    }
}
