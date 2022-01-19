package base.conditions;
import java.util.*;

public class switch_base {
    public static void main(String[] args) throws Exception{

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter a number: ");

            int num = pog.nextInt();

            switch(num){
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Yeet");
                    break;
            }
        }
    }
}
