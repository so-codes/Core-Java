package base.functions;

class extends_fn {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends extends_fn {
    void bark(){
        System.out.println("Barking");
    }
}

class Inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();

        extends_fn a = new extends_fn();
        a.eat();
    }
}
