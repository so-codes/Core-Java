package base.conditions;
import java.util.*; 

public class pos_neg {
    public static void main(String[] args) throws Exception{

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = pog.nextInt(); 

            if(num > 0){
                System.out.println("Positive");
            }
            else if (num < 0){
                System.out.println("Negative");
            }
            else {
                System.out.println("It's 0 mate");
            }
        }
    }
}
