package base.interface_bs;

interface basic {
    public void print();
}
interface basic1 {
    public void print();
}

class A implements basic, basic1 {

    public void print() {
        System.out.println("This is A");
    }
    public void print1() {
        System.out.println("This is A1");
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print1();
    }
}
