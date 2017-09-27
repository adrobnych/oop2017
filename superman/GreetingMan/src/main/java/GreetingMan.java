import java.util.Scanner;

/**
 * Created by adrobnych on 24.09.17.
 */
public class GreetingMan {
    public static void main(String[] arguments){

        Person human = new Person();
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        human.setName(scan.nextLine());
        System.out.println("Which language is native for you?");
        human.setLanguage(scan.nextLine());

        Translator translator = new Translator();
        translator.initData();

        System.out.println(translator.getGteering(human.getLanguage())
                + " " + human.getName());
    }
}
