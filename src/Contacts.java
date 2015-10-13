import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by BennettIronYard on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args ) {
        Contact bob = new Contact("Bob" , 30);
        Contact alice = new Contact("Alice" , 20);
        Contact charlie = new Contact("Charlie" , 25);

        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);

        ArrayList<Contact> contactsUnderThirty = new ArrayList();

        Contact contactToFind = null;
        for (Contact c : contacts) {
            if (c.age < 30)) {
                break;
            } //pos position
        } // for loop

        HashMap<String, Contact> contactMap = new HashMap();
        contactMap.put("Bob", bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);
        //contactToFind = contactMap.get("Alice");

        if (contactToFind == null) {
            System.out.println("couldn't find ");

        }else {
            System.out.println("Found contact ");
        } //else statement
    } // public static void
} // public class Contacts


