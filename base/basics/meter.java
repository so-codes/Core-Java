package base.basics;
import java.util.*; 

public class meter {
    public static void main(String[] args) throws Exception{
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter meters:- ");
            int m = sc.nextInt() , sum; 

            sum = m * 100;
            System.out.println("After conversion of meters to centemeters we get :- " + sum);
        }
    }
}
