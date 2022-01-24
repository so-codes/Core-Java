package base.functions;
import java.util.*;

class single_Student {
    int id;
    String name;
}

public class singlestud {
    public static void main(String[] args)throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            single_Student s1 = new single_Student();

            System.out.print("Enter students name:- ");
            s1.name = sc.nextLine();

            System.out.print("Enter students id:- ");
            s1.id = sc.nextInt();

            System.out.println("Showing student data");

            System.out.println("Name: "+ s1.name);
            System.out.println("Id: "+ s1.id);

        }
    } 
}
