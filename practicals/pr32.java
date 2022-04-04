package practicals;

import java.util.*;

class Emp {

    int empid;
    String empname;
    long emmobilenumber;

    void getEmpDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        System.out.print("Enter employee name: ");
        empname = sc.next();
        System.out.print("Enter employee mobile number: ");
        emmobilenumber = sc.nextLong();

        sc.close();
    }

    void display() {
        System.out.println("Empid : " + empid);
        System.out.println("Empname : " + empname);
        System.out.println("Emmobilenumber : " + emmobilenumber);
    }

}

class Fulltime extends Emp {

    String deptname;
    int salary;

    Fulltime(String deptname, int salary) {
        this.deptname = deptname;
        this.salary = salary;
    }

    void display() {
        System.out.println("Deptname : " + deptname);
        System.out.println("Salary : " + salary);
    }

    void getEmpDetails() {
        super.display();
    }

}

class Parttime extends Emp {

    int numberofdays;

    Parttime(int numberofdays) {
        this.numberofdays = numberofdays * 1000;
    }

    void display() {
        System.out.println("Number of days : " + numberofdays);
    }

}

public class pr32 {

    public static void main(String[] args) {

        Emp e = new Emp();
        System.out.println("\n");
        e.getEmpDetails();
        System.out.println("\n");
        e.display();

        System.out.println("\n");

        Fulltime f = new Fulltime("Hina Chan", 50000);
        f.display();

        System.out.println("\n");

        Parttime p = new Parttime(10);
        p.display();

    }

}
