package ArrayPrograms;

import java.util.Scanner;
public class arrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Initialize array
        System.out.println("Enter elements of Array : ");
        int arr1[] = new int[5];
        for (int i=0;i<5;i++){
            arr1[i] = s.nextInt();
        }
        System.out.println("Array is");
        for (int i=0;i<5;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("Reversed Array is");
        for (int i=5-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }
    }
}
