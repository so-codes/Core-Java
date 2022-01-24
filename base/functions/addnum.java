package base.functions;
import java.util.*;

public class addnum {
    int a,b;
    void calsum(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");

            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Ans is "+ (a + b));
        }
    }
    void calsumPara(double x , double y){
        System.out.println("Ans is "+ (x + y));
    }
    public static void main(String[] args) throws Exception
    {
        addnum  A = new addnum();
        System.out.println(A.a + " and " + A.b);
        A.calsum();

        try (Scanner hi = new Scanner(System.in)) {

            System.out.println("Enter two numbers: ");

            double f = hi.nextDouble();
            double g = hi.nextDouble();

            System.out.println("Ans is "+ (f + g));
            A.calsumPara(f, g);
        }
        // System.out.println("Ans is "+ (m + n));
        // A.calsumPara(m, n);
    }
}
