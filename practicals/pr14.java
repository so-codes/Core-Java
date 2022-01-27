package practicals;
import java.util.*;

public class pr14 {
    public static void main(String[] args) throws Exception{

        try (Scanner pog = new Scanner(System.in)) {
            char ch = 'y';
            while(ch =='y'){
            System.out.print("\nEnter two number: ");
            int a = pog.nextInt();
            int b = pog.nextInt();

            System.out.print("\nChoose an operation\n+ = Addition\n- = Substraction\n* = Multiplication\n/ = Multiplication\n------------------------------\n");

            System.out.print("\nEnter an operation: ");
            char op = pog.next().charAt(0);

            switch(op){
                case '+':
                    System.out.println("\nAnswer is: "+ (a+b));
                    break;

                case '-':
                    System.out.println("\nAnswer is: "+ (a-b));
                    break;

                case '*':
                    System.out.println("\nAnswer is: "+ (a*b));
                    break;
                    
                case '/':
                    System.out.println("\nAnswer is: "+ (a/b));
                    break;

                default:
                    System.out.println("\nIncorrect operation");
            } 
            System.out.println("Do you want to continue: ");
            ch = pog.next().charAt(0);    
        }
    }
    }
}
