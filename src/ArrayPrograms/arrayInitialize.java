//Initialization of Array diff types
package ArrayPrograms;

import java.util.Scanner;
public class arrayInitialize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Initialize array
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        int arr2[] = new int[5];
        for (int i=0;i<5;i++){
            arr2[i] = s.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println(arr2[i]);
        }
    }
}
