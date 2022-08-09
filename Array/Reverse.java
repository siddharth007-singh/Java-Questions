package Array;
import java.util.*;

public class Reverse {

    public static void ReverseArray(int arr[], int n) {
        for(int i=0; i<n; i+=2){
            if(i+1<n){
                Arrays.copyOf(arr[i], arr[i+1]);
            }
        }  
    }

    public static void main(String[] args) {
        int arr[] = new int []{6,2,3,4,5};
        int n = arr.length;
        ReverseArray(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
