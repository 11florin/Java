package workbook8;

public class Airline {

    Person[] people;

    public Airline() {
        this.people = new Person[11];
    }
    public Person getPerson(int index) {
        Person person = this.people[index];
        return new Person(person);   //copy constructor creates copy of object
    }
    /** Setter name: setPerson
     * @param person (Person)
     * 
     * Inside the setter:
     * 
     *   1. Index the array, and set that element equal to the Person object. 
     */
    public void setPerson(Person person) {
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person(person);
    }
}
