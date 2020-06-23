package MatrixPrograms;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Rows in Matrix : ");
        int n = s.nextInt();
        System.out.print("Enter number of Columns in Matrix : ");
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        int transpose[][] = new int[m][n];
        int i, j;
        System.out.println("Enter the Elements of Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix is :");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // Loop to transpose
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
