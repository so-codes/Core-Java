package base.functions;

// class RectArea {
//     int area(int l , int b)
//     {
//         int a = l * b;
//         return a;
//         return l * b;
//     }
// }

class area_class {
    int area(int l , int b)
    {
        // int a = l * b;
        // return a;
        return l * b;
    }
    public static void main(String[] args){
        area_class R = new area_class();
        int ans = R.area(3,4);
        System.out.println("Area is "+ ans);
        System.out.println("Area is "+ R.area(2,2));
    }
}
