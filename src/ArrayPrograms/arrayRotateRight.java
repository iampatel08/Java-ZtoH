package ArrayPrograms;

import java.util.Scanner;
public class arrayRotateRight {
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
        int last;
        last = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]=last;
        System.out.println();
        //Printing Array
        System.out.println("New ARRAY IS : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
