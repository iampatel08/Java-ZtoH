package MatrixPrograms;

import java.util.Scanner;
public class matrixMultiply {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Rows in First array : ");
        int n1 = s.nextInt();
        System.out.print("Enter number of Columns in First array : ");
        int m1 = s.nextInt();
        System.out.print("Enter number of Rows in Second array : ");
        int n2 = s.nextInt();
        System.out.print("Enter number of Columns in Second array : ");
        int m2 = s.nextInt();
        if (m1!=n2){
            System.out.print("Columns in First array should be equal to Row in Second array ");
            System.exit(0);
        }
        int arr1[][] = new int[n1][m1];
        int arr2[][] = new int[n2][m2];
        int i, j,k;
        System.out.print("Enter the Elements of first array :\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m1; j++) {
                arr1[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("Enter the Elements of Second array :\n");
        for (i = 0; i < n2; i++) {
            for (j = 0; j < m2; j++) {
                arr2[i][j] = s.nextInt();

            }
            System.out.println();
        }
        System.out.print("First array :\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m1; j++) {
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.print("Second array :\n");
        for (i = 0; i < n2; i++) {
            for (j = 0; j < m2; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of both the array is : ");
        int sum = 0;
        int product[][] = new int[n1][m2];
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m2; j++) {
                for (k = 0;k < m1;k++){
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                product[i][j] = sum;
                sum = 0;
            }
        }
        System.out.print("Multiplied Array is :\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m2; j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}
