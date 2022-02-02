package base.functions;

class area_con {
    area_con(int r) {
        System.out.println("Area of circle is " + (3.14 * r * r));
    }
    area_con(int l, int b) {
        System.out.println("Area of rectangle is " + (l * b));
    }
    void show() {
        System.out.println("This is pog");
    }
    public static void main(String[] args){
        area_con a1 = new area_con(10);
        a1.show();
        area_con a2 = new area_con(10, 20);
        a2.show();
    }
}
