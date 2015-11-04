import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by BennettIronYard on 11/4/15.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"}; //sort and put alphabetically
        ArrayList<String> sortedNames = new ArrayList();
        // compare to
        /*String str1 = "Charlie";
        String str2 = "David";
        String str3 = "Alice";
        String str4 = "Bob";
        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);
        */
        for (String name : names) { //have to loop over
            int index = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }else  {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}


