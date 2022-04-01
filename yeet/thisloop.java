package yeet;

public class thisloop {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { // 4

            for (int j = 1; j < 5; j++) { // 4 == 4 * 4

                for (int m = 1; m < 5; m++) { // 4 == 4 * 4 * 4
                    System.out.println("i: " + i + " j: " + j + " m: " + m);
                }
            }
        }
    }
}
