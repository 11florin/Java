public class ReturnedValues {
    public static void main(String []args) {
        //calculateArea(5.2, 3.5);

        double area1 = calculateAreaWithReturn(2.3, 3.6);
        // double area2 = calculateAreaWithReturn(2.3, 3.1);
        // double area3 = calculateAreaWithReturn(2.5, 4.6);

        printArea(2.3, 3.6, area1);

    //    calculateAreaWithReturn(-5.5, -2.2);


        String englishExplanation = explainArea("English");
        // String franchExplanation = explainArea("French");
        // String spanishExplanation = explainArea("Spanish");
        // String italianExplanation = explainArea("Italian");
        System.out.println(englishExplanation);



    }
    public static void calculateArea(double length, double width) {
        double area  = length * width;
        System.out.println("Area = " + area);
    }
    public static double calculateAreaWithReturn(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid Dimensions");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }


    public static String explainArea(String language) {
        switch(language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a  la longuer * la larger";
            case "Spanish": return "area is igual a largo * ancho";
            default: return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a a width of " + width + " has a area of " + area);
    }
    
}
