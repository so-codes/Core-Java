package base;

public class area {
    public static void main(String[] args) {

        int l = 10, b = 5 , area = l * b, r = 3;
        final float pi = 3.14f;

        System.out.println("\nArea of a rectangle when lengeth is "+ l +" and breadth is "+ b);
        System.out.println("\nArea of a rectangle is " + area);
        System.out.println("\nWhen radius = "+ r + "\nArea of a circle is " + (pi*r*r));
        System.out.print("\n");
    }
}
