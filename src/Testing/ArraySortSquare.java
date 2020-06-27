package Testing;

import java.util.Scanner;

public class ArraySortSquare extends ArraySort{
    public static void main(String[] args) {
        ArraySortSquare obj = new ArraySortSquare();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //doing square
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]*arr[i];
        }
        System.out.println();
        System.out.println("Array After doing square is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int narr[] = new int[n];
        narr = obj.sorting(arr,n);
        System.out.println();
        System.out.println("Sorted array After doing square each element is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(narr[i] + " ");
        }
    }
}
