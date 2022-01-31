package base.basics;

public class overload_calc {
    void display(){
        System.out.println("This is method overloading program");
    }
    void display(int a , int b){
        System.out.println("Addition of int a & b: " + (a+b));
    }
    void display(double a , double b){
        System.out.println("Addition of double a & b: " + (a+b)); 
    }

    public static void main(String[] args){
        overload_calc m1 = new overload_calc();
        m1.display();
        m1.display(20,30);
        m1.display(10.5,20.5);
    }
}
