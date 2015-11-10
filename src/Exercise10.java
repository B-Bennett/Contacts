import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;
        //int numReversed = 54321;
        String numStr = String.valueOf(num);
        String numStrReversed = new StringBuilder(numStr).reverse().toString();
        
       /*  for (int i = numStr.length()-1; i >= 0; i--) {
            numStrReversed += numStr.charAt(i);
        }
        */
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numReversed);
    }
}
