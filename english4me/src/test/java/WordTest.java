import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adrobnych on 06.09.17.
 */
public class WordTest {
    @Test
    public void testSum(){
        CalcAndMath math = new CalcAndMath();
        assertEquals(5, math.sum(2, 3));
        assertEquals(2, math.sum(-1, 3));
        assertEquals(-33336, math.sum(-3, -33333));
        assertEquals(0, math.sum(0, 0));
    }

    @Test
    public void testSettersAndGetters(){
        Word word = new Word();
        word.setEnglishTranslation("dog");
        assertEquals("dog", word.getEnglishTranslation());
        word.setUkrainanTranslation("собака");
        assertEquals("собака", word.getUkrainanTranslation());
        word.setRating((float) 0.9);
        assertEquals(0.9, word.getRating(), 0.00001);
        word.setNumberOfTest(10);
        assertEquals(10, word.getNumberOfTest());
    }

    @Test
    public void testUpdateRating(){
        Word word = new Word();
        word.setEnglishTranslation("dog");
        assertEquals("dog", word.getEnglishTranslation());
        word.setUkrainanTranslation("собака");
        assertEquals("собака", word.getUkrainanTranslation());
        word.setRating((float) 0.9);
        assertEquals(0.9, word.getRating(), 0.00001);
        word.setNumberOfTest(10);

        boolean result = true;

        word.updateRating(result);

        assertEquals(0.9090909, word.getRating(), 0.00001);

        result = false;

        word.updateRating(result);

        assertEquals(0.83333, word.getRating(), 0.00001);

    }
}
