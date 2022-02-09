package base.class_fn;

class super_fn {
    int x , y , z;
    super_fn(int x , int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void display(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}

class Bsub extends super_fn {
    int a, b;
    Bsub(int x , int y , int z , int a , int b){
        super(x , y , z);
        this.a = a;
        this.b = b;
    }
    void show(){
        System.out.println("a = " + a + " b = " + b);
        super.display();
        System.out.println("a = " + super.x);
    }

    public static void main(String[] args) {
        Bsub b1 =new Bsub(1,2,3,4,5);
        b1.show();
    }
}
