import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by BennettIronYard on 10/27/15.
 */
public class Excercise5 {
    public static void main(String[] args) {

        String s = "To be or not to be, that is the question.";

        //Remove commas and periodss.
        s = s.replace(",", "").replace(".", "");
        //Make it all lowerCase.
        s = s.toLowerCase();
        //split into words
        String[] words = s.split(" ");
        //remove duplicats
        ArrayList<String> newWords = new ArrayList();
        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
        //create a new string without the duplicate words
            String newSring = " ";
            for (String newWord : newWords){
                String newString = "";
                if (!newString.isEmpty()) {
                    newString += " ";
                }
                newString += newWord;
        //to be or not that is the question "look like this"
            }
            System.out.println(newSring);


        }
    }
}
