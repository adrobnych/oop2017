/**
 * Created by adrobnych on 05.09.17.
 */
public class GreetingFromJava {
    public static void main(String[] params){
        for(int i =0 ; i<10; i++) {
            CalcAndMath math = new CalcAndMath();
            System.out.println("Sum of 4 and 6 is " + math.sum(4, 6));
        }
    }

}
