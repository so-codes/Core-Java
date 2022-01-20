package base.basics;
import java.util.*;

public class input {
        public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number:- ");
            double poggers = sc.nextDouble(); 

            System.out.println("User num is: " + poggers);
        }
    }
}
