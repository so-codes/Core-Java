package practicals;
import java.util.*;

public class pr5 {
    public static void main (String[] args) {  
        System.out.print("\nEnter hours: ");
        try (Scanner sc = new Scanner(System.in)){  
        int hours = sc.nextInt(); 
        int minutes = hours * 60; 
        System.out.println("There are " + minutes + " minutes in " + hours + " hours\n");   
        }  
    }  
}
