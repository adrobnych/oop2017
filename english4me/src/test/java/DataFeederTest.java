import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adrobnych on 06.09.17.
 */
public class DataFeederTest {

    @Test
    public void testDataLoading(){
        MyDictionary dict = new MyDictionary();

        new DataFeeder(dict).feed();

        assertEquals(5, dict.getSize());
    }


}
