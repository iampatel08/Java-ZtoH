package MatrixPrograms;

import java.util.Scanner;

public class matrixLowerTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Rows and Columns of Matrix");
        int c = s.nextInt();
        int arr[][] = new int[c][c];
        System.out.println("Enter Elements of Matrix");
        for(int i = 0;i<c;i++){
            for (int j =0;j<c;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for(int i = 0;i<c;i++){
            for (int j =0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Lower Triangle of Matrix is ");
        for(int i = 0;i<c;i++){
            for (int j =0;j<c;j++){
                if(i>=j){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
