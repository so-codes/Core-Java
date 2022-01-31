package base.basics;

public class overload {
    void display(){
        System.out.println("This is method overloading program");
    }
    void display(int a){
        System.out.println("Value of a is " +a);
    }
    void display(int a , int b){
        System.out.println("Value of a is " + a + " and value of b is " + b);
    }
    void display(double a , double b){
        System.out.println("Value of a is " + a + " and value of b is " + b);
    }

    public static void main(String[] args){
        overload m1 = new overload();
        m1.display();
        m1.display(10);
        m1.display(20,30);
        m1.display(10.5,20.5);
    }
}
