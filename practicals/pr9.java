package practicals;
import java.util.*;

public class pr9 {
    public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("\nEnter starting num: ");
        int start = sc.nextInt();

        System.out.print("\nEnter ending number: ");
        int end = sc.nextInt();
        int i = 0 ;
    
        System.out.println("\nDisplay the even numbers between "+ start +" and "+ end +" are :");

        for(i = start; i <= end; i++){ 
            int r = i % 2; 
            if(r == 0){
                System.out.println(i);
            }
        }

        System.out.println("\nDisplay the odd numbers between "+ start +" and "+ end +" are :");
        for(i = start; i <= end; i++){ 
            int r = i % 2; 
            if(r == 1){ 
                System.out.println(i);
            }
        }
    }
    }
}
