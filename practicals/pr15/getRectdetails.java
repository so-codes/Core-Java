package practicals.pr15;

import java.util.Scanner;

public class getRectdetails {
    double x, y;

    public getRectdetails(double x, double y) {

        System.out.print("Enter the length of the rectangle: ");
        try (Scanner sc = new Scanner(System.in)) {
            this.x = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            this.y = sc.nextDouble();
        }
    }

    public double area() {
        return x * y;
    }

}
