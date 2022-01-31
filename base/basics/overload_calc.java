package base.basics;

public class overload_calc {
    void display(){
        System.out.println("This is method overloading program\n");
    }
    void display(int a , int b){
        System.out.println("Addition of int a & b: " + (a+b));
    }
    void display(double a , double b){
        System.out.println("Addition of double a & b: " + (a+b)); 
    }
    void display(String a , String b, String c){
        System.out.println("Addition of string: " + (a+b+c)); 
    }
    public static void main(String[] args){
        overload_calc m1 = new overload_calc();
        System.out.print("\n");
        m1.display();
        
        m1.display(20,30);
        m1.display(10.5,20.5);
        m1.display("Criz"," is ","poggers");
        System.out.print("\n");
    }
}
