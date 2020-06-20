package ArrayPrograms;

import java.util.Scanner;
public class arrayOnEven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in the array : ");
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Array is : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Elements at EVEN position : ");
        for (int i=0;i<n;i++){
            if(i%2==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
