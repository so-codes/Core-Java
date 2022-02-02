package base.functions;

class cons_emp {
    String ename;
    int eid;
    cons_emp(String empname, int empid) {
        ename = empname;
        eid = empid;
    }
    void show() {
        System.out.println("Employee name is " + ename + " and Employee id is " + eid);
    }
    public static void main(String[] args) {
        cons_emp e1 = new cons_emp("John", 101);
        e1.show();
        cons_emp e2 = new cons_emp("Smith", 102);
        e2.show();
    }
}
