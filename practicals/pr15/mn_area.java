package practicals.pr15;

import java.util.Scanner;

public class mn_area {

    int length, width, area;

    public mn_area() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of the rectangle: ");
            this.length = sc.nextInt();
            System.out.print("Enter the width of the rectangle: ");
            this.width = sc.nextInt();
        }
    }

    public int area() {
        return length * width;
    }

    public static void main(String[] args) {
        mn_area m = new mn_area();
        System.out.print("\nArea of rectangle is: " + m.area());
    }
}
