package base.loop;
import java.util.*;

public class while_lp {
    
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.print("First "+ num + " natural numbers");
            int i = 1;
            System.out.println("1");
            while(i <= num){
                System.out.println(i + " ");
                i = i + 1;
            }

            System.out.print("First "+ num + " natural numbers in reverse order");
            System.out.println("5");

            while(num > 0){
                System.out.println(num);
                num -= 1;
            }
        }
    }
}
