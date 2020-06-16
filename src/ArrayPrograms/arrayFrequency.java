//Program to find the frequency of each element in the array
package ArrayPrograms;
import java.util.Scanner;
public class arrayFrequency {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of element to enter : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int fr[][] = new int[n][2];
        for (int i=0;i<n;i++)
        {
            fr[i][0]=arr[i];
        }
        for (int i=0;i<n;i++){

        }
    }
}
