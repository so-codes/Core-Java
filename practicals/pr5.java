package practicals;
import java.util.*;

public class pr5 {
    public static void main (String[] args) {  
        float minutes, hours;  
        System.out.print("Enter hours: ");
        try (Scanner sc = new Scanner(System.in)){  
        hours = sc.nextFloat(); 
        minutes = hours * 60; 
        System.out.println("There are " + minutes + " minutes in " + hours + " hours");   
        }  
    }  
}
