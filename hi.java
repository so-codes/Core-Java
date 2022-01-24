import java.util.*;

public class hi {
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
        hi  A = new hi();
        System.out.println(A.a + " and " + A.b);
        A.calsum();

        try (Scanner ok = new Scanner(System.in)) {

            System.out.println("Enter two numbers: ");

            double f = ok.nextDouble();
            double g = ok.nextDouble();

            // System.out.println("Ans is "+ (f + g));
            A.calsumPara(f, g);
        }

        // int f = 10;
        // int g = 20;
        // System.out.println("Ans is "+ (f + g));
        // A.calsumPara(f, g);
    }
}
