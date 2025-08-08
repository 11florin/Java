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

        // person.setSeatNumber(10);
        person.chooseSeat();

        Person twin = new Person(person); // creates a cpoy of the first object

        twin.setName("Valentina"); // Updates name fields of the seconf object
        twin.setSeatNumber(3); // Update the seat number of the second

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: "
                + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() +
                "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        System.out.println("Name: " + twin.getName() + "\n" +
                "Nationality: " + twin.getNationality() + "\n" +
                "Date of Birth: " + twin.getDateOfBirth() + "\n" +
                "Seat Number: " + twin.getSeatNumber() + "\n");

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");

        }
    }
}
