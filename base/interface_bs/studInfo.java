package base.interface_bs;

public class studInfo {
    String sname = "";
    int sid = 0;
    void accept(String sname, int sid) {
        this.sname = sname;
        this.sid = sid;
    }
}

interface displayint {
    public void display();
}

class stud_info extends studInfo implements displayint {
    public void display() {
        System.out.println("Student name is " + sname + " and id is " + sid);
    }
    public static void main(String[] args) {
        stud_info s = new stud_info();
        s.accept("Pocky", 10);
        s.display();
    }
}
