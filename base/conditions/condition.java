package base.conditions;

public class condition {
    public static void main(String[] args) {

        int a = 30 , b = 20;

        // String result = (a > b)?a + "A is max":"B is max";   // conditional operator

        String poggers = (a > 0)?a + " is positive":a + " is negative";

        System.out.println(poggers);

        if(a > b){
            System.out.println("a is max");
        }
        else if(b > a){
            System.out.println("b is max");
        }
        else{
            System.out.println("Both are same");
        }
    }
}
