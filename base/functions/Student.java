package base.functions;

public class Student {
    
    int id;
    String name;
    public static void main(String[] args){
        Student s1 = new Student();

        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.id = 101;
        s1.name = "Criz";

        System.out.println(s1.id);
        System.out.println(s1.name);

        Student s2 = new Student();

        s2.id = 102;
        s2.name = "Pog";

        System.out.println(s2.id);
        System.out.println(s2.name);

    }
}
