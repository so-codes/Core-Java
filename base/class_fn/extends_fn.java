package base.class_fn;

class extends_fn {
    extends_fn(int x){
        System.out.println("A is called "+ x);
    }
}

class B1 extends extends_fn {
    B1(int x){
        super(x);
        System.out.println("B1 is called " + x);
    }
    public static void main(String[] args) {
        new B1(3);    // or B1 b1 = new B1();
    }   
}
