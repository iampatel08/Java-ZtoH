package ArrayPrograms;

import java.util.Scanner;
public class ArrayLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int larg = arr[0];
        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (larg <= arr[i]) {
                larg = arr[i];
            }
        }
        System.out.println();
        System.out.println("Largest Element in the array is : " +larg);
    }
}
