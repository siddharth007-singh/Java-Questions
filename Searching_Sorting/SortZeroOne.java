package Searching_Sorting;

public class SortZeroOne {

    public static void PrintArray(int arr[], int n) {
        for(int i=0;i<n;i++){
            System.out.println("After Sorting The Array : " + arr[i]);
        }
    }

    public static void SortingZeroOne(int arr[], int n) {
        int s=0, e=n-1;
        while(s<=e){
            if(arr[s]==0){
                s++;
            }
            else if(arr[e]==1){
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
        int arr[] = {0,1,0,0,1,0,1};
        int n = arr.length;
        SortingZeroOne(arr, n);
        PrintArray(arr,n);
    }
}
