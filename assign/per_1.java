import java.util.*;

public class per_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == n) {
                System.out.println("Entered number: " + n + " is perfect number");
            } else {
                System.out.println("Entered number: " + n + " is not perfect number");
            }
        }
    }
}
