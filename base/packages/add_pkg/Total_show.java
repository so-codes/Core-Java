package base.packages.add_pkg;

public class Total_show {
    public static void main(String[] args) {

        addTst a = new addTst(5, 10);
        subTst s = new subTst(7, 13);

        System.out.println();

        System.out.println("Addition is " + a.sum());
        System.out.println("Subtraction is " + s.sub());
    }
}
