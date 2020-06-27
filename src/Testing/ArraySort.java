package Testing;

public class ArraySort {
    public int[] sorting(int arr[], int n) {
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
        return arr;
    }
}
