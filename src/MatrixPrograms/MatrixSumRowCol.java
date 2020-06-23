package MatrixPrograms;

import java.util.Scanner;

public class MatrixSumRowCol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number Rows of Matrix : ");
        int r = s.nextInt();
        System.out.print("Enter Number Columns of Matrix : ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Row "+(i+1)+" is :"+sum);
        }
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Column "+(j+1)+" is :"+sum);
        }
    }
}
