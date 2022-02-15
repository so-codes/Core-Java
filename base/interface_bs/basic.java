package base.interface_bs;

interface basic {
    public void print();
}

class A implements basic {

    public void print() {
        System.out.println("This is A");
    }
    void methods(){
        System.out.println("This is A's methods");
    }


    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.methods();
    }
}
