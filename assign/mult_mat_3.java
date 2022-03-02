import java.util.*;

public class mult_mat_3 {
    // write a program in java to enter 2D matrix of size 3X3 and perform
    // multiplication of two matrix. Display answer in proper matrix format.

    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        System.out.println("Enter elements of first matrix");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
