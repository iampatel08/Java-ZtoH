package ArrayPrograms;

import java.util.Scanner;

public class Array2ndSmallest {
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
        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
        int small = 1;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                small = small+1;
            }
            if (small == 2){
                break;
            }
        }
        System.out.println();
        System.out.println("Second Smallest Element in the array is : "+arr[i+1]);
    }
}
