package base.functions;

class stud_con {
    String name;
    double per;
    stud_con(String name, double per){
        this.name = name;
        this.per = per;
    }
    stud_con(String name){
        this.name = name;
    }
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);
    }
    public static void main(String[] args){
        stud_con s1 = new stud_con("Pog", 95.69);
        s1.show();
        stud_con s2 = new stud_con("Ice");
        s2.show();
    }
}