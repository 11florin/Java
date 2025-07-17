package WorkBook.WorkBook1;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Florin", "Romanian", "11 - 11 - 1111", 5);
        // person.name = "Florin";
        // person.nationality = "Romanian";
        // person.dateOfBirth = "11 - 11 - 1111";
        // person.passport = new String[] { person.name, person.nationality,
        // person.dateOfBirth };
        // person.seatNumber = 5;

        // System.out.println(person.name);
        // System.out.println(person.nationality);
        // System.out.println(person.dateOfBirth);
        // System.out.println(Arrays.toString(person.passport));
        // System.out.println(person.seatNumber);

        System.out.println("Name: " + person.name + "\n" + "Nationality: "
                + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth +
                "\n" + "Seat Number: " + person.seatNumber + "\n");
    }
}
