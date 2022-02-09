package base.class_fn;

class another_fn {
    another_fn(int a){
        System.out.println("A = "+ a);
    }
}

class BP extends another_fn {
    BP(int a ,int b){
        super(a);
        System.out.println("B = "+ b);
    }
}

class CP extends BP {
    CP(int a , int b ,int c){
        super(a,b);
        System.out.println("C = "+ c);
    }
    public static void main(String[] args) {
        new CP(1,2,3);
    }
}
