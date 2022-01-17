package base.conditions;
import java.util.*; 

public class pass {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks:- ");
            int marks = sc.nextInt(); 

            if(marks < 40){
                System.out.println("Fail");
            }
            else {
                System.out.println("Pass");
            }
        }
    }
}
