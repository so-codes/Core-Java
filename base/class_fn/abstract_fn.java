package base.class_fn;

abstract class abstract_fn {
    abstract void display();
}

class add extends abstract_fn {
    int a,b;
    add(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a+b);
    }
}

class sub extends abstract_fn {
    int a,b;
    sub(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a-b);
    }
}

class MainCal {
    public static void main(String[] args) {
        add obj1=new add(10,20);
        obj1.display();
        sub obj2=new sub(10,20);
        obj2.display();
    }
}
