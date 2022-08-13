import java.util.*;

public class MoveZero {

    public static void PrintArray(int arr[], int n) {
        for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void MoveZeros(int arr[], int n) {
        //Move All the zero in the left side
        int s=0, e=n-1;//put The Indexing Frist
        while(s<=e){
            while(arr[s]==0){
                s++;
            }
            while(arr[e]==1){
                e--;
            }
            // swap(arr[s],arr[e]);
            Collections.swap(arr, s, e);
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,0,0,1,0};
        int n = arr.length;
            MoveZeros(arr, n);
            PrintArray(arr, n);

    }
}
