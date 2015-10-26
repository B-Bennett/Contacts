import java.util.HashMap;

/**
 * Created by BennettIronYard on 10/26/15.
 */
public class Excercise4 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        HashMap<String, Integer> frequencies = new HashMap();

       String[] words = sentence.split(" ");
        for (String word : words) {
            String cleanWord = word.toLowerCase().replace(",","").replace(".", "");//Replace the comma and period
            if (frequencies.get(cleanWord) == null) {
                frequencies.put(cleanWord, 1);
            }else {
                int count = frequencies.get(cleanWord);
                frequencies.put(cleanWord, count + 1);
            }
        }
        System.out.println(frequencies);

    }
}
