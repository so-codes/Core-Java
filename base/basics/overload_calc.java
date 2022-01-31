package base.basics;

public class overload_calc {
    void yeet(){
        System.out.println("This is method overloading program\n");
    }
    void yeet(int a , int b){
        System.out.println("Addition of int a & b: " + (a+b));
    }
    void yeet(double a , double b){
        System.out.println("Addition of double a & b: " + (a+b)); 
    }
    void yeet(String a , String b, String c){
        System.out.println("Addition of string: " + (a+b+c)); 
    }
    public static void main(String[] args){
        overload_calc m1 = new overload_calc();
        System.out.print("\n");
        m1.yeet();
        
        m1.yeet(20,30);
        m1.yeet(10.5,20.5);
        m1.yeet("Criz"," is ","poggers");
        System.out.print("\n");
    }
}
