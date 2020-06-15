package ArrayPrograms;
import java.util.Scanner;
public class addArray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = s.nextInt();
        System.out.print("Enter number of columns : ");
        int c = s.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        System.out.println("Enter the first matrix");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                b[i][j]=s.nextInt();
            }
        }
        int[][] sum=new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j =0;j<c;j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("First matrices is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrices is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the two matrices is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
