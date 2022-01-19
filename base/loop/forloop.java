package base.loop;

public class forloop {
    public static void main(String[] args){
        int n = 10, sum = 0;

        System.out.println("First "+ n +" natural numbers");

        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
        }
        for(int i=1;i <= n;i++){
            sum = sum + i;
        }

        System.out.print("\nSum is "+ sum);
        System.out.print("\n\nOdd numbers are \n");

        for(int i=1;i<=n;i=i+2){
            System.out.println(i + " ");
        }
        int num = 5;
        for(int i = 1;i<=10;i++){
            System.out.println(num+ " x "+ i + " = "+ (num*i));
        }
    }
}
