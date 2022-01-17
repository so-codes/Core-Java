package base.conditions;
import java.util.*; 

public class pos_neg {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt(); 

            if(num >= 0){
                System.out.println("Positive");
            }
            else {
                System.out.println("Negative");
            }
        }
    }
}
