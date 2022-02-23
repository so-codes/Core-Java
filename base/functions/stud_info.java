package base.functions;

class stud_info {
    int sid;
    String sname;

    void set_info(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
}

class marks extends stud_info {
    int m1, m2, m3;

    void set_marks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void display_stud() {
        System.out.println("Student id: " + sid);
        System.out.println("Student name: " + sname);
        System.out.println("Marks: " + m1 + " ," + m2 + " ," + m3);
    }
}

class stud_grade extends marks {
    void display() {
        int total = m1 + m2 + m3;
        System.out.println("Total marks: " + total);
        if (total >= 300) {
            System.out.println("Grade: A");
        } else if (total >= 200 && total < 300) {
            System.out.println("Grade: B");
        } else if (total >= 100 && total < 200) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}

class ThirdMain {
    public static void main(String[] args) {
        stud_grade sg = new stud_grade();
        sg.set_info(101, "John");
        sg.set_marks(100, 200, 300);
        sg.display_stud();
        sg.display();
    }
}
