package arrayList.codingExercise;

public class Main {
    
    public static void main(String[] args) {
        
         MobilePhone mobilePhone = new MobilePhone("0740123456");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);

        mobilePhone.printContacts();

        Contact newTom = Contact.createContact("Tom", "23571113");
        mobilePhone.updateContact(contact3, newTom);

        mobilePhone.removeContact(contact1);

        mobilePhone.printContacts();

        Contact searched = mobilePhone.queryContact("Alice");
        if (searched != null) {
            System.out.println("Found: " + searched.getName() + " -> " + searched.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}
