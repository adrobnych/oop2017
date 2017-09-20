import java.util.LinkedList;
import java.util.List;

/**
 * Created by adrobnych on 08.09.17.
 */
public class MyDictionary {

    List<Word> data = new LinkedList<Word>();

    public void addWord(Word word) {
        data.add(word);
    }

    public long getSize(){
        return data.size();
    }

    public Word worstKnownWord() {
        float minRating = 1000;
        Word result = null;
        for(Word word : data){
            if(minRating > word.getRating()) {
                minRating = word.getRating();
                result = word;
            }
        }

        return result;
    }
}
