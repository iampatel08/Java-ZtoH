package ArrayPrograms;

import java.util.Scanner;
import java.util.Vector;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
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
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Vector<Integer> unique = new Vector<Integer>();
        for (int i = 0;i<=n-2;i++){
            if (arr[i]!=arr[i+1]){
                unique.add(arr[i]);
            }
        }
        unique.add(arr[n-1]);
        System.out.println();
        System.out.println("Unique Elements of the array are : ");
        System.out.print(unique);
    }
}
