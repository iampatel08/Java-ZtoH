package MatrixPrograms;

import java.util.Scanner;

public class matrixSparse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number Rows of Matrix : ");
        int r = s.nextInt();
        System.out.print("Enter Number Columns of Matrix : ");
        int c = s.nextInt();
        int size = r*c;
        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int count = 0;
        System.out.println("Matrix is :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
                if (arr[i][j] == 0){
                    count +=1;
                }
            }
            System.out.println();
        }
        if(count>size/2){
            System.out.println("Matrix is Sparse Matrix");
        }
        else {
            System.out.println("Matrix is not a Sparse Matrix");
        }
    }
}
