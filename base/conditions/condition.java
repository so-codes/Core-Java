package base.conditions;

public class condition {
    public static void main(String[] args) {

        int a = 30 , b = 20;

        String result = (a > b)?a + "A is max":"B is max";

        System.out.println(result);

        if(a>b){
            System.out.println("a is max");
        }
        else if(b>a){
            System.out.println("b is max");
        }
        else{
            System.out.println("Both are same");
        }
    }
}
