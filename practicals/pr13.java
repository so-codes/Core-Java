package practicals;

public class pr13 {
    public static void main(String[] args) {
        int row = 3;
        System.out.println("Pattern 1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 2");
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3");
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 4");
        int a, pog = 4;
        for (a = 0; a < pog; a++) {
            if (a % 2 == 0) {
                System.out.println("^^^^");
            } else {
                System.out.println("===");
            }
        }

        System.out.println();
        System.out.println("Pattern 5");
        int d, f;
        int pig = 4;
        for (d = 0; d <= pig; d++) {
            for (f = 1; f <= pig - d; f++) {
                if (f % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 6");
        int q, w, t = 1;

        for (q = 1; q <= 4; q++) {
            for (w = 1; w < q + 1; w++) {
                System.out.print(t++ + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 7");

        int criz = 5;
        for (int l = criz - 1; l >= 0; l--) {
            for (int k = 0; k <= l; k++) {
                System.out.print("1" + " ");
            }
            System.out.println();
        }
        for (int l = 0; l < criz; l++) {
            for (int k = 0; k <= l; k++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
