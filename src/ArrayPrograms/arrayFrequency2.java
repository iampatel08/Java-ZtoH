//Program to find the frequency of each element in the array
package ArrayPrograms;
import java.util.Scanner;
public class arrayFrequency2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0;
        int max = 0;
        //Requesting and Taking Array
        System.out.print("Enter number of element to enter : ");
        int n = s.nextInt();
        int arr1[] = new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println();
        //Printing Array
        System.out.println("ARRAY IS : ");
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        //Copying Array arr1 to arr2
        int arr2[] = new int[n];
        for (int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }

        //Removing Duplicate value from the copy of arr1
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr2[i] != arr2[i+1]){
                temp[j++] = arr2[i];
            }
        }
        temp[j++] = arr2[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr2[i] = temp[i];
            max = i+1;
        }
        System.out.println();
        //Printing UNIQUE Array
        System.out.println("Unique ARRAY IS : ");
        for (int i=0;i<max;i++){
            System.out.print(arr2[i]+" ");
        }
        //Checking for Frequencies
        int fr[][] = new int[2][max];
        for (int i=0;i<max;i++)
        {
            fr[0][i]=arr2[i];
        }
        for (int i=0;i<max;i++){
            for (j = 0;j<n;j++)
            {
                if (arr2[i]==arr1[j]){
                    count = count +1;
                }
                fr[1][i] = count;
                count = 0;
            }
        }
        System.out.println();
        System.out.println("Frequency of every Element is");
        for (int i = 0; i<2;i++){
            for (j =0;j<max;j++){
                System.out.print(fr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}