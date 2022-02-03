package base.functions;

class copy_fn {
    int id;
    String name;
    copy_fn(int i, String n){
        id = i;
        name = n;
    }

    copy_fn(copy_fn s){
        id = s.id;
        name = s.name;
    }

    void show(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){
        copy_fn s1 = new copy_fn(1, "Pog");
        copy_fn s2 = new copy_fn(s1);
        s1.show();
        s2.show();
    }
}

