package base.functions;

class Student_main {
    int id;
    String name;
}

public class Students2 {
    int per = 10;

    public static void main(String[] args) {
        Student_main s1 = new Student_main();

        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.id = 101;
        s1.name = "abc";

        System.out.println(s1.id);
        System.out.println(s1.name);

        Students2 ts1 = new Students2();

        ts1.per = 90;
        System.out.println("per " + ts1.per);

        Student_main s2 = new Student_main();

        s2.id = 102;
        s2.name = "xyz";
        System.out.println(s2.id); // accessing member through object
        System.out.println(s2.name);

        System.out.print("Hi");
    }
}
