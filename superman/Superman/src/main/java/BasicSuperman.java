import java.util.LinkedList;
import java.util.List;

/**
 * Created by adrobnych on 20.09.17.
 */
public class BasicSuperman {
    private String name;
    private String superName;

    BasicSuperman(String name, String superName){
        this.setName(name);
        this.setSuperName(superName);
    }

    public BasicSuperman() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    private  static List<BasicSuperman> registry = new LinkedList<BasicSuperman>();

    public static void callToAll() {
        for(BasicSuperman sm : registry){
            sm.call();
        }
    }

    public static void register(BasicSuperman man) {
        registry.add(man);
    }

    protected void call() {

    }

    public static BasicSuperman init(BasicSuperman createdObject){
        BasicSuperman.register(createdObject);
        return createdObject;
    }
}
