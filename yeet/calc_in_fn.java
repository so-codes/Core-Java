package yeet;

import java.util.*;

class calc_in_fn {
    Scanner sc;
    int a;
    void accept(){
        sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
    }
}

class cube extends calc_in_fn {
    void calcube(){
        System.out.println("Cube of number is: " + (a*a*a));
    }
    public static void main(String[] args){
        cube c = new cube();
        c.accept();
        c.calcube();
    }
}
