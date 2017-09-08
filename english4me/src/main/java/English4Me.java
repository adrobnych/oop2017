/**
 * Created by adrobnych on 05.09.17.
 */
public class English4Me {
    public static void main(String[] params){
        MyDictionary dict = new MyDictionary();

        Word word = new Word();
        word.setEnglishTranslation("cat");
        word.setUkrainanTranslation("кіт");
        word.setRating(0);
        word.setNumberOfTest(1);

        dict.addWord(word);

        System.out.println("We have " + dict.getSize() + " words on our dictionary now!");
    }

}
