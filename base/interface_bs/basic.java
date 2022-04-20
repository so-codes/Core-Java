package base.interface_bs;

interface basic {
    public void print();
}

interface basic1 {
    public void print1();
}

class A implements basic, basic1 {

    public void print() {
        System.out.println("This is A");
    }

    public void print1() {
        System.out.println("This is A1");
    }

    public static void main(String[] args) {

        basic b = new A();
        b.print();

        basic1 b1 = new A();
        b1.print1();
    }
}
