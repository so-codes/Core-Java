package base.functions;
import java.util.*;

class rect_con {
    double length;
    double breadth;
    rect_con(double l, double b) {
        // length = l;
        // breadth = b;
        this.length = l;
        this.breadth = b;
    }
    void show() {
        System.out.println("\nLength is " + length + " and Breadth is " + breadth + "\n");
    }
    double area(){
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rect_con r3 = new rect_con(l, b);
        r3.show();
        System.out.println("Area is " + r3.area());
        sc.close();
    }
}
