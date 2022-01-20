package practicals;
import java.util.*;

public class pr8 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter number: ");
            int num = sc.nextInt();
           
            for(int i = 1; i<num; i++) {
               if(num % i == 0) {
                  System.out.println(" "+i);
               }
            }
         }
     }
}
