package practicals;
import java.util.*;
public class pr7 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        int x;

        if (age >= 18 && age < 100){
          System.out.print("User is eligible to vote");
        }

        else{
          System.out.println("User is not eligible to vote");
          x = 18 - age;
          System.out.println("Number of years left to vote: "+x);
        }
      }
    } 
}