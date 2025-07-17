package WorkBook.WorkBook1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Florin";
        person.nationality = "Romanian";
        person.dateOfBirth = "11 - 11 - 1111";
        person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };
        person.seatNumber = 5;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
