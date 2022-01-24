package base.functions;
import java.util.*;

public class addnum {
    int a,b;
    static Scanner sc = new Scanner(System.in);
    void calsum(){
        System.out.print("Enter two numbers: ");

        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Ans is "+ (a + b));
        System.out.print("\n");
    }
    void calsumPara(double x , double y){
        System.out.println("In function: Ans is "+ (x + y));
    }
    public static void main(String[] args)
    {
        addnum  A = new addnum();
        System.out.println(A.a + " and " + A.b);
        A.calsum();

            System.out.println("Enter two numbers: ");

            double f = sc.nextDouble();
            double g = sc.nextDouble();

            System.out.println("Ans is "+ (f + g));
            System.out.print("\n");
            A.calsumPara(f, g);
            System.out.print("\n");
    }  
}
