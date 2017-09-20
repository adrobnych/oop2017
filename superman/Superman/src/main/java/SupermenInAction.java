/**
 * Created by adrobnych on 20.09.17.
 */
public class SupermenInAction {
    public static void main(String[] params){
        Batman batman = new Batman();
        batman.setName("Mr. Wayn");
        batman.setSuperName("batman");

        System.out.println("Say hi to " + batman.getSuperName());
        System.out.println(".. and his special thing: " + batman.helmetDescription());

        Saakashvily michael = new Saakashvily();
        michael.setName("Michael");
        michael.setSuperName("BorderKiller");

        System.out.println("Say hi to " + michael.getSuperName());
    }
}
