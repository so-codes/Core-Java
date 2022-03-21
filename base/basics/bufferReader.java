package base.basics;

import java.io.*;

class bufferReader {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a number: ");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter another number: ");
            int b = Integer.parseInt(br.readLine());
            
            System.out.println("Number before swapping: " + a + " " + b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Number after swapping: " + a + " " + b);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}