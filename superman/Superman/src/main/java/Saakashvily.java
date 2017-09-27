/**
 * Created by adrobnych on 20.09.17.
 */
public class Saakashvily extends BasicSuperman{

    Saakashvily(String name, String superName) {
        super(name, superName);
    }

    public Saakashvily() {
        super();
    }

    @Override
    public void call(){
        System.out.println("Where is border to be killed? Baryga.");
    }
}
