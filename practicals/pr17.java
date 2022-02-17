package practicals;

import java.util.Scanner;

public class pr17 {
    Scanner sc = new Scanner(System.in);
    int stud_id;
    String stud_name;
    double stud_per;

    void insertStud() {
        System.out.println("Enter Student ID");
        stud_id = sc.nextInt();
        System.out.println("Enter Student Name");
        stud_name = sc.next();
        System.out.println("Enter Student Perc");
        stud_per = sc.nextDouble();
    }

    void display() {
        System.out.println(" Student ID " + stud_id);
        System.out.println(" Student Name " + stud_name);
        System.out.println(" Student perc " + stud_per);
    }

    public static void main(String ar[]) {
        pr17 s[] = new pr17[3];
        for (int i = 0; i < 3; i++) {
            s[i] = new pr17();
            s[i].insertStud();
        }
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
