import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/15/15.
 */
public class Excersie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice,", "Bob", "Charlie", "Austin", "Albert", "Conner"};
        for (String name : words) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            }else {
                list.add(name);
            }
        }
        System.out.println(groups);
    }
    static void sayHello(Scanner scanner) {
        String input = "";
        while (!input.equalsIgnoreCase("hello")) {
            System.out.println("type 'Hello'");
            input = scanner.nextLine();
        }
        do {
            System.out.println("Type 'Hello'");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("Hello"));

        while (true) {
            System.out.println("Type 'Hello'");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Hello"));
            System.out.println("Thank You");
            System.exit(0);
        }
    }

}
