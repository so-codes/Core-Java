package practicals;
import java.util.*;

public class pr10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("\nEnter number: ");
            int num = sc.nextInt();
            int i = 1;

            while(i <= 10){
                System.out.println(num +" * "+ i +" = "+ num*i);
                i++;
            }
        }
    }
}
