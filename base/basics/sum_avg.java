package base.basics;
import java.util.*;

public class sum_avg {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter three numbers: ");
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int sum , avg;
            sum = num1 + num2 + num3;
            avg = sum / 3;

            System.out.print("\n\nSum of three numbers: "+ sum +"\nAverage of three numbers: "+ avg +"\n\n");
        }
    }
}
