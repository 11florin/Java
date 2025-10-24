package workbook7;

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("Florin", "Romanian", "01/11/1111", 5);

        if (person.applyPassport()) {
            person.setPassport();
        }
        System.out.println(person);
    }
}
