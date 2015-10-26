import java.util.HashMap;

/**
 * Created by BennettIronYard on 10/26/15.
 */
public class Excercise4Extra {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        HashMap<String, Integer> frequencies = new HashMap();

        String[] words = sentence.toLowerCase().split("\\s+");
        for (String word : words) {
            int counter = 1;
            for (String word2 : words) {
                if (word2.equals(word)) {
                    frequencies.put(word, counter);
                    counter++;
                }
            }
        }
        System.out.println();
    }
}
