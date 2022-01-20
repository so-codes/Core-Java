package base.loop;
import java.util.*;

public class dowhile {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.print("First "+ num + " natural numbers");
            int i = 0;
 
            do{
                System.out.println(i + " ");
                i+=1;
            }while(i<=num);
            System.out.println();
            System.out.println("Square of "+ num + " natural numbers");
            i=1;
            do{
                System.out.println((i*i)+ " ");
                i+=1;
            }while (i <= num);

            System.out.println();
            i=1;
            int a = 0, b = 1, sum = 0;

            System.out.print(a+ " "+ b + " ");
            do{
                sum = a + b;
                System.out.print(sum+ " ");
                a = b;
                b = sum;
                i += 1;
            }while(i <= (num-1) );
        }
    }
}
