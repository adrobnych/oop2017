/**
 * Created by adrobnych on 15.09.17.
 */
public class DataFeeder {
    MyDictionary dictionary;

    DataFeeder(MyDictionary dictionary){
        this.dictionary = dictionary;
    }

    public void feed(){
        Word word = new Word();
        word.setEnglishTranslation("cat");
        word.setUkrainanTranslation("кіт");
        word.setRating(0);
        word.setNumberOfTest(1);

        dictionary.addWord(word);

        word = new Word();
        word.setEnglishTranslation("dog");
        word.setUkrainanTranslation("собака");
        word.setRating(0);
        word.setNumberOfTest(1);

        dictionary.addWord(word);

        word = new Word();
        word.setEnglishTranslation("table");
        word.setUkrainanTranslation("стіл");
        word.setRating(0);
        word.setNumberOfTest(1);

        dictionary.addWord(word);

        word = new Word();
        word.setEnglishTranslation("chair");
        word.setUkrainanTranslation("стілець");
        word.setRating(0);
        word.setNumberOfTest(1);

        dictionary.addWord(word);

        word = new Word();
        word.setEnglishTranslation("white board");
        word.setUkrainanTranslation("дошка");
        word.setRating(0);
        word.setNumberOfTest(1);

        dictionary.addWord(word);

    }

}
