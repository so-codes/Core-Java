package base.loop;
import java.util.*;

public class nes_for_lp {
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            System.out.println("Pattern");

            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }
    }
}
