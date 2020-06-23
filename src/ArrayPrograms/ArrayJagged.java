package ArrayPrograms;

import java.util.Scanner;
public class ArrayJagged {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.print("Enter number of rows : ");
        int r = s.nextInt();
        int[][] a = new int[r][];
        for (i=0;i<r;i++)
        {
            System.out.print("Enter number of columns for row no. "+(i+1)+" : ");
            int c=s.nextInt();
            a[i]=new int[c];
        }
        System.out.println("Enter values of jagged array : ");
        for (i=0;i<r;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                int val=s.nextInt();
                a[i][j]=val;
            }
        }
        System.out.println();
        System.out.println("Jagged array is : ");
        for (i=0;i<r;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
