package practicals;
import java.util.*;

public class pr2 {
    
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter name: ");
            String str= sc.nextLine();
            System.out.println("Name: "+str);
            System.out.print("Enter gender: ");
            char x = sc.next().charAt(0);
            System.out.println("Gender: "+x);
            System.out.print("Enter the age: ");
            int n = sc.nextInt();
            System.out.println("The age is: "+n);
            System.out.print("Enter the phone no: ");
            long a = sc.nextLong();
            System.out.println("Phone No: "+a);
            System.out.print("Enter the percentage: ");
            float b = sc.nextFloat();
            System.out.println("Percentage: "+b);
           
         }
    }
}
