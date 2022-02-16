package base.interface_bs;

interface A1 {
    public void method1();
}

interface A2 extends A1 {
    public void method2();
}

public class main_inter implements A2{
    public void method1() {
        System.out.println("method1");
    }
    public void method2() {
        System.out.println("method2");
    }
    public static void main(String[] args){
        main_inter m1 = new main_inter();
        m1.method1();
        m1.method2();
    }
}
