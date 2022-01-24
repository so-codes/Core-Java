package base.functions;

class Student1 {
    int id;
    String name;
}

public class Stud {
    public static void main(String[] args){
        Student1 s1 = new Student1();

        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.id = 101;
        s1.name = "Criz";

        System.out.println(s1.id);
        System.out.println(s1.name);
    }   
}
