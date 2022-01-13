package base;
import java.util.*;

public class max {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter two numbers: ");
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 > num2){
                System.out.println("Num1 is maximum out of the 2 numbers\n");
            }
            else if (num1 < num2){
                System.out.println("Num2 is maximum out of the 2 numbers\n");
            }
            else {
                System.out.println("Both the number are equal\n");
            }
        }
    }
}
