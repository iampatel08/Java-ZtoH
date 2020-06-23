package MatrixPrograms;

import java.util.Scanner;
public class MatrixAdd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Rows in Matrix : ");
        int n = s.nextInt();
        System.out.print("Enter number of Columns in Matrix : ");
        int m = s.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        int i, j;
        System.out.print("Enter the Elements of first Matrix :\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("Enter the Elements of Second Matrix :\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr2[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("First Matrix :\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.print("Second Matrix :\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of both the Matrices is : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
