package ArrayPrograms;

import java.util.Scanner;

public class arrayRemoveDuplicate {
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
        System.out.println();
        System.out.println("Sorted array in Ascending Order is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int j=0;
        int unique[] = new int[n];
        for (int i = 0;i<n-2;i++){
            if (arr[i]!=arr[i+1]){
                unique[j] = arr[i];
                j++;
            }
        }
        unique[j+1] = arr[n-1];
        System.out.println();
        System.out.println("Array w/o Duplicate Value is : ");
        for (int i = 0; i < unique.length; i++) {
                System.out.print(unique[i] + " ");
        }
    }
}
