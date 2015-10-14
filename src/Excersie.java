import java.util.ArrayList;

/**
 * Created by BennettIronYard on 10/14/15.
 */
public class Excersie {
    public static void main(String[] args) {
        Contact alice = new Contact();
        alice.name = "Alice";
        alice.age = 25;

        Contact bob = new Contact();
        alice.name = "Bob";
        alice.age = 35;


        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(alice);
        contacts.add(bob);


        // String[] contacts = {"Alice", "Bob", "Charlie", "Austin"};
        for (Contact contact : contacts) {

            //List all contacts starting with "A"
            if (contact.name.startsWith("A")) {
                System.out.println(contact.name);
            }
        }
    }
}
