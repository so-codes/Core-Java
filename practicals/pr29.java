package practicals;

import java.util.*;

class number {
    int length;
    int breadth;

    number(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("\nLength: " + length + "\nBreadth: " + breadth);
    }
}

class area extends number {
    area(int length, int breadth) {
        super(length, breadth);
    }

    void display() {
        super.display();
        System.out.println("\nArea of rectangle is " + (length * breadth));
    }
}

public class pr29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n");

            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            System.out.print("Enter the breadth: ");
            int breadth = sc.nextInt();
            area obj = new area(length, breadth);
            obj.display();
        }
    }
}
