package base.functions;

import java.util.*;

class add_inc_fn {
    double a,b;
    Scanner sc;
    void accept(){
        sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextDouble();
        System.out.print("Enter another number: ");
        b = sc.nextDouble();
    }
}

class add extends add_inc_fn{
    double calsum(){
        return (a+b);
    }
}

class FirstMain {
    public static void main(String[] args){
        add a1 = new add();
        a1.accept();
        double ans = a1.calsum();
        System.out.println("Sum is: " + ans);
    }
}
