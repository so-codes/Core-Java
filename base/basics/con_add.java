package base.basics;

public class con_add {
    con_add(){      // default constructor
        System.out.println("This is constructor overloading program");
    }
    void pog(int a , int b){
        System.out.println("Addition of int a & b: " + (a+b));
    }

    public static void main(String[] args){
        con_add a = new con_add();
        a.pog(20,30);
    }
}
