package base.array;
import java.util.*;

public class sum_arr {
    
    public static void main(String[] args) {
        try (Scanner pog = new Scanner(System.in)) {
            int z[] = new int[4];
            int sum =0;

            for(int i = 0;i<4;i++){
                System.out.print("Enter number: ");
                z[i] = pog.nextInt();

                sum = sum+z[i];
            }
            System.out.println("\nSum of array is: "+ sum);
        }
    }
}
