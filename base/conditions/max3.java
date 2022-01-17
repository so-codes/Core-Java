package base.conditions;
import java.util.*;

public class max3 {
    public static void main(String[] args) throws Exception{

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter three numbers: ");

            int num1 = pog.nextInt();
            int num2 = pog.nextInt();
            int num3 = pog.nextInt();

            if(num1 > num2 && num1 > num3){
                System.out.println("Num1: "+ num1 +" is maximum out of the 3 numbers\n");
            }
            else if (num2 > num1 && num2 > num3){
                System.out.println("Num2: "+ num2 +" is maximum out of the 3 numbers\n");
            }
            else if (num3 > num1 && num3 > num2){
                System.out.println("Num3: "+ num3 +" is maximum out of the 3 numbers\n");
            }
            else {
                System.out.println("All the number are equal\n");
            }
        }
    }
}
