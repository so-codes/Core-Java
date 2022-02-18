package practicals;

public class pr23 {

    void area_of_triangl() {

        double base = 5, height = 10, area;
        System.out.print("\n");
        System.out.println("Base of triangle is " + base + " and height is " + height);
        area = (base * height) / 2;
        System.out.print("Area of triangle is: " + area + "\n");

    }

    void area_of_rectangle() {
        double length = 10, breadth = 5, area;
        System.out.print("\n");
        System.out.println("Length of rectangle is " + length + " and breadth is " + breadth);
        area = length * breadth;
        System.out.print("Area of rectangle is: " + area + "\n");
    }

    void area_of_circle() {

        double radius = 5, area;
        System.out.print("\n");
        System.out.println("Radius of circle is " + radius);
        area = (double) (3.14 * radius * radius);

        System.out.print("Area of circle is: " + area + "\n\n");

    }

    public static void main(String[] args) {
        pr23 obj = new pr23();
        obj.area_of_triangl();
        obj.area_of_rectangle();
        obj.area_of_circle();
    }

}
