import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by BennettIronYard on 10/19/15.
 */
public class Exercsie3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap();

        for (String name : names) { //will print out the first for names.
            for (String name2 : names) { //loop back over
                if (!name.equals(name2)) { // stop duplicates
                    System.out.println(String.format("%s %s", name, name2));
                }//end of if statement
            }//end of 2nd for loop
        }//end of for loop
    }//end of public static void
}//end of public class
