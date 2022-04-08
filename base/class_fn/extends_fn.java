package base.class_fn;

class extends_fn {
    extends_fn(int x, int y) {
        System.out.println("A is called " + x);
    }
}

class B1 extends extends_fn {
    int z;

    B1(int x, int y, int z) {
        super(x, y);
        System.out.println("B1 is called " + z);
    }

    public static void main(String[] args) {
        new B1(3, 2, 4); // or B1 b1 = new B1();
    }
}
