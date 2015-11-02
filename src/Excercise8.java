import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by BennettIronYard on 11/2/15.
 */
public class Excercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            names.add(columns[1]+ " " + columns[2]);

            //Split line into array of columns

            //add first and last name to "names"
        }

        String searchTerm = "ali";
        ArrayList<String > results = new ArrayList();
        //fill up "results" with all the names the contain searchTerm (case-insensitive)
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())){
                results.add(name);

            }
        }
        System.out.println(results);

        final String searchTerm2 = searchTerm;
        List<String> results2 =
                names
                .parallelStream()
                .filter((name) ->{
                    return name.toLowerCase().contains(searchTerm2);
                })
                .collect(Collectors.toList());
        System.out.println(results2);
    }
}
