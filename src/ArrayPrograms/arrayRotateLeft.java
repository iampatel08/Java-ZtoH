package ArrayPrograms;

import java.util.Scanner;
public class arrayRotateLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Initialize array
        System.out.print("Enter number of element to enter : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();
        //Printing Array
        System.out.println("ARRAY IS : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int first;
        first = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println();
        //Printing Array
        System.out.println("New ARRAY IS : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
