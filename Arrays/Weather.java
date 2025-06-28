package Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemperature(celsius, "Celsius");
        printTemperature(fahrenheit, "Fahrenheit");

    }
    /**
     * Method name: celsiusToFahrenheit.
     * @param celsius (double[] )
     * @return fahrenheit (double[])
     * 
     * Inside the method: 
     *  1. Creates a double[] array called 'fahrenheit'.
     *  2. Copy all the values from celsius to fahrenheit.
     *  3. Update the fahrenheit values (F = (C/5 * 9) + 32).
     *  4. Return fahrenheit.
     */
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }

    /** Task 3
     * Method name - printTemperatures
     * @param temp ( double[] )
     * @param type ( String ) can have one of two values: Celsius or Fahrenheit
     * 
     * Inside the method:
     *   1. Uses a for loop to print the temperature values on the SAME line.
     *        Celsius: [Celsius values separated by a space]
     *        Fahrenheit: [Temperature values separated by a space]
     *   2. Adds a new line of space after printing the contents of each array.
     *   3. Rounds every temperature value to two decimal places. 
     */

     public static void printTemperature(double[] temp, String type) {
        System.out.print(type + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");
     }
}
