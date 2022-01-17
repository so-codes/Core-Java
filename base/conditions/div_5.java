package base.conditions;
import java.util.*;

public class div_5 {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num % 5 == 0){
                System.out.println("Number is divisible by 5");
            }
            else {
                System.out.println("Number is not divisible by 5");
            }
        }
    }
}
