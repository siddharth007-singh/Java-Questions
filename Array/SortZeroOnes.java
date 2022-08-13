package Array;

public class SortZeroOnes {

    public static void PrintArray(int arr[], int n) {
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void MoveZeros(int arr[], int n) {
        //Moving Zero either left or the right side of the array;
        int s=0, e=n-1;
        while(s<=e){
            if(arr[s]==1){
                s++;
            }
            else if(arr[e]==0){
                e--;
            }
            else{
                swap(arr[s], arr[e]);
                s++;
                e--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,0,0,1,0};
        int n = arr.length;
        MoveZeros(arr, n);
        PrintArray(arr, n);
    }
}
