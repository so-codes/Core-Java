package base.functions;

class add_con {
    int a, b, c;
    add_con(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void show() {
        System.out.println("Addition is " + (a + b + c));
    }
    public static void main(String[] args){
        add_con a1 = new add_con(10, 20, 30);
        a1.show();
    }
}
