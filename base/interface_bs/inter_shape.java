package base.interface_bs;

interface shape {
    public String name();
}

class circle implements shape {
    public String name() {
        return "circle";
    }
}

class Rect implements shape {
    public String name() {
        return "Rectangle";
    }
}

class inter_shape {
    public static void main(String[] args) {
        circle c = new circle();
        Rect r = new Rect();
        System.out.println(c.name());
        System.out.println(r.name());
    }
}