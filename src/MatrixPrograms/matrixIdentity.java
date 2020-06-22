package MatrixPrograms;

import java.util.Scanner;
public class matrixIdentity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number Rows & Columns of Matrix : ");
        int r = s.nextInt();
        int arr[][] = new int[r][r];
        System.out.println("Enter Elements of Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int flag =0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if((i==j) && (arr[i][j]!=1)){
                    flag =1;
                }
                else if ((i!=j)&&(arr[i][j]!=0)){
                    flag =1;
                }
            }
        }
        if (flag==0){
            System.out.println("It is an Identity Matrix");
        }
        else {
            System.out.println("It is not an Identity Matrix");
        }
    }
}
