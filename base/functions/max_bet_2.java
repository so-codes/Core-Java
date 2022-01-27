package base.functions;
import java.util.*;

public class max_bet_2 {

    int Max()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number:- ");
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            if(a >= b){
                return a;
            } else {
                return b;
            }
        }
    }
    public static void main(String[] args){
        max_bet_2 M = new max_bet_2();

        System.out.println("Max number is "+ M.Max());
    }
}
