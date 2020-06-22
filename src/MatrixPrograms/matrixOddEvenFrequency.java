package MatrixPrograms;

import java.util.Scanner;
public class matrixOddEvenFrequency {
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
        int even = 0 , odd = 0;
        System.out.println("Matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] % 2==0){
                    even += 1;
                }
                else {
                    odd+=1;
                }
            }
            System.out.println();
        }
        System.out.println("Number of Even Elements in Matrix : "+even);
        System.out.println("Number of Odd Elements in Matrix : "+odd);
    }
}
