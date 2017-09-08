/**
 * Created by adrobnych on 06.09.17.
 */
public class Word {
    private String englishTranslation;
    private String ukrainanTranslation;
    private float rating;
    private int numberOfTest;

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        this.englishTranslation = englishTranslation;
    }

    public String getUkrainanTranslation() {
        return ukrainanTranslation;
    }

    public void setUkrainanTranslation(String ukrainanTranslation) {
        this.ukrainanTranslation = ukrainanTranslation;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public void setNumberOfTest(int numberOfTest) {
        this.numberOfTest = numberOfTest;
    }

    public void updateRating(boolean result) {

        int numeric_test_result;
        if(result)
            numeric_test_result = 1;
        else
            numeric_test_result = 0;


        float new_rating = (getRating() * getNumberOfTest() +
                numeric_test_result) / (getNumberOfTest() + 1);

        setRating(new_rating);

        setNumberOfTest(getNumberOfTest() + 1);
    }
}
