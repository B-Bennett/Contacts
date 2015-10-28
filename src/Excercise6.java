import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by BennettIronYard on 10/28/15.
 */
public class Excercise6 { //TWO WAYS OF SOLVING
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie", "david", "allen", "barbie", "colin", "dan"));
        //take first 5 (in one command)
        names = new ArrayList (names.subList(0,5));
        solveViaStream(names);
        solveViaTempLists(names);
        sovleViaDirectModification(names);
     }
    static void sovleViaDirectModification(ArrayList<String> names) {
        //make every String in capital
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i).toUpperCase();
            names.set(i, s);
        }
        // Remove the ones that start with "A"
        Iterator<String> it = names.iterator(); //to remeove a item while looping over
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(names);
    }
    static void solveViaTempLists(ArrayList<String>names) {
        //Make every string inside uppercase
        ArrayList<String> tempNames = new ArrayList();
        for (String name : names) {
            tempNames.add(name.toUpperCase());
        }
        names = tempNames;

        //Remove the ones that start with "A"
        tempNames = new ArrayList();
        for (String name : names) {
            if (!name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        names = tempNames;

        System.out.println(names);
    }
    static void solveViaStream(ArrayList<String> names) { //produces in a single. simultaniously can run each item
        List<String> newNames =
                names
                .stream()    // run a function on every
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> { //return or remove it?
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList()); // bring this back into a string/lis

        System.out.println(newNames);
    }

}
