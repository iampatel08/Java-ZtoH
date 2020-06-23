package MatrixPrograms;

import java.util.Scanner;
public class MatrixInitialize {
    public static void main(String args[]) {
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Elements of first Matrix :\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr1[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("Enter the Elements of Second Matrix :\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr2[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("First Matrix :\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.print("Second Matrix :\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
