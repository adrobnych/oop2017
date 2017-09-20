import java.util.Scanner;

/**
 * Created by adrobnych on 05.09.17.
 */
public class English4Me {
    public static void main(String[] params){
        MyDictionary dict = new MyDictionary();

        new DataFeeder(dict).feed();

        while(true) {

            Word worstWord = dict.worstKnownWord();

            System.out.println("Translate word " + worstWord.getEnglishTranslation() + " to Ukraininan...");
            Scanner scanner = new Scanner(System.in);
            String yourVersion = scanner.nextLine();

            boolean testIsCorrect = worstWord.getUkrainanTranslation()
                    .equals(yourVersion);

            System.out.println(" Your version " + yourVersion + " is " +
                    (testIsCorrect? "correct" : "incorrect"));
            worstWord.updateRating(testIsCorrect);
        }
    }

}
