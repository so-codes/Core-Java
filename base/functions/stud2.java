package base.functions;
import java.util.*;

class Student_for2 {
    int id;
    String name;
    float percentage;
}

public class stud2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Student_for2 s1 = new Student_for2();
            Student_for2 s2 = new Student_for2();

            System.out.println("\nStudent 1 data\n");

            System.out.print("Enter students name:- ");
            s1.name = sc.nextLine();

            System.out.print("Enter students id:- ");
            s1.id = sc.nextInt();

            System.out.print("Enter students percentage:- ");
            s1.percentage = sc.nextFloat();

            System.out.println("\nStudent 2 data\n");

            System.out.print("Enter students name:- ");
            s2.name = sc.next();

            System.out.print("Enter students id:- ");
            s2.id = sc.nextInt();

            System.out.print("Enter students percentage:- ");
            s2.percentage = sc.nextFloat();

            System.out.print("\nShowing student data\n\n");

            System.out.println("Name: "+ s1.name);
            System.out.println("Id: "+ s1.id);
            System.out.println("Percentage "+ s1.percentage +" %\n");

            System.out.println("Name: "+ s2.name);
            System.out.println("Id: "+ s2.id);
            System.out.println("Percentage: "+ s2.percentage +" %\n");
        }
    }
}
