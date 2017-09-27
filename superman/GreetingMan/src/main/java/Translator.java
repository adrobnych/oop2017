import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrobnych on 24.09.17.
 */
public class Translator {
    private Map<String, String> database = new HashMap<String, String>();

    public void initData(){
        database.put("english" , "Hello Sir");
        database.put("spanish", "Hola");
    }

    public String getGteering(String lang){
        return database.get(lang);
    }
}
