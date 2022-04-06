package practicals;

import java.util.*;

public class pr22 {
    Scanner pog = new Scanner(System.in);
    int num, i;
    int arr[];
    int temp = 0;

    public void getdata() {
        System.out.print("\n");

        System.out.print("Enter the size of array: ");
        num = pog.nextInt();

        arr = new int[num];

        System.out.print("Enter the numbers: ");
        for (i = 0; i < num; i++) {
            arr[i] = pog.nextInt();
        }

    }

    void putdata() {
        System.out.print("\n");
        System.out.print("Entered numbers by the user are: ");
        for (i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
    }

    void asce() {
        for (i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Ascending order of number are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    void desc() {
        for (i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Descending order of number are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        pr22 ob = new pr22();
        ob.getdata();
        ob.putdata();
        ob.asce();
        ob.desc();
    }

}
