package practicals;

import java.util.*;

class student_34 {

    void getdetails(String name, int id, int class1) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student class: ");
        class1 = sc.nextInt();
        sc.close();
    }
}

interface Resultstud {

    default void GetResultstud(int sub1, int sub2, int sub3) {
        int total = sub1 + sub2 + sub3;
        if (total >= 90) {
            System.out.println("Grade is A");
        } else if (total >= 80) {
            System.out.println("Grade is B");
        } else if (total >= 70) {
            System.out.println("Grade is C");
        } else if (total >= 60) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
    };

    default void GetStudDetails(String name, int id, int class1) {
        System.out.println("Student name is: " + name);
        System.out.println("Student id is: " + id);
        System.out.println("Student class is: " + class1);
    }
}

class Studdetails extends student_34 implements Resultstud {

    int sub1, sub2, sub3;
    String name;
    int id;
    int class1;

    void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student class: ");
        class1 = sc.nextInt();
        System.out.print("Enter marks of subject 1: ");
        sub1 = sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        sub2 = sc.nextInt();
        System.out.print("Enter marks of subject 3: ");
        sub3 = sc.nextInt();
        sc.close();
    }

    void displaystud() {
        int total = sub1 + sub2 + sub3;
        System.out.println("Total marks: " + total);
        System.out.println("Marks of subject 1 : " + sub1);
        System.out.println("Marks of subject 2 : " + sub2);
        System.out.println("Marks of subject 3 : " + sub3);
        GetResultstud(sub1, sub2, sub3);
        GetStudDetails(name, id, class1);
    }
}

public class pr34 {

    public static void main(String[] args) {

        Studdetails stud = new Studdetails();
        stud.getdetails();
        stud.displaystud();
    }
}
