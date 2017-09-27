/**
 * Created by adrobnych on 20.09.17.
 */
public class SupermenInAction {
    public static void main(String[] params){
        Batman batman = (Batman) BasicSuperman.init(
                new Batman("Mr. Wayn", "batman"));

        System.out.println("Say hi to " + batman.getSuperName());
        System.out.println(".. and his special thing: " + batman.helmetDescription());

        Saakashvily michael = (Saakashvily) BasicSuperman.init(
                new Saakashvily("Michael", "BorderKiller"));

        System.out.println("Say hi to " + michael.getSuperName());

        MegaBatMan mb1 = (MegaBatMan) BasicSuperman.init(
                new MegaBatMan("Mike", "betterBatman"));


        MegaBatMan mb2 = (MegaBatMan) BasicSuperman.init(
                new MegaBatMan(mb1));

        System.out.println("Say hi to " + mb2.getSuperName());

        BasicSuperman.callToAll();

    }
}
