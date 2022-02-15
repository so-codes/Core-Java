package base.final_bs;

class final_bs {
    void show(){
        System.out.println("This is final_bs");
    }
}

class BchildF extends final_bs {
    void show(){
        System.out.println("This is BchildF");
    }
    public static void main(String[] args) {
        BchildF a = new BchildF();
        a.show();
    }
}
