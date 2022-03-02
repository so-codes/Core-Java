package base.excep;

public class arr_try {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[6] = 6;
            System.out.println("Number is " + a[3]);
        }
        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array index out of bound");
        // }

        catch (Exception e) {
            System.out.println("Exception handled " + "\n" + e);
        }
    }
}
