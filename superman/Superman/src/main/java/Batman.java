/**
 * Created by adrobnych on 20.09.17.
 */
public class Batman extends BasicSuperman {
    Batman(String name, String superName) {
        super(name, superName);
    }

    public String helmetDescription(){
        return "hat with long ears";
    }

    public Batman() {
    }

    @Override
    public void call(){
        System.out.println("Batman is here");
    }
}
