package practicals;
import java.util.*;
public class pr7 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)){

        System.out.print("\nEnter the age: ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 100){
          System.out.print("\nUser is eligible to vote\n\n");
        }
        else if(age > 100){
          System.out.print("\nUser is eligible to vote , Please take care !\n\n");
        }

        else{
          System.out.print("\nUser is not eligible to vote\n");
          int x = 18 - age;
          System.out.println("\nNumber of years left to vote: "+ x +"\n");
        }
      }
    } 
}