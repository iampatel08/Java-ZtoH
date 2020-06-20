package ArrayPrograms;

// HAVE TO DO HELL LOT OF WORK


import java.util.Scanner;
public class arrayUnique {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int arr1[] = new int[10];
        System.out.println("Enter element of Array : ");
        for(int i=0;i<10;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("ARRAY IS : ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<10;i++){
            for (int j=1;j<10;j++){
                if(arr[i]==arr[j]){
                    arr1[i] = arr[j];
                }
            }
        }
        System.out.println("New ARRAY IS : ");
        for(int i=0;i<10;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
