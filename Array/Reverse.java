package Array;
import java.util.*;

public class Reverse {

    public static void ReverseArray(int arr[], int n) {
        int s= 0;
        int e= n-1;
        while(s<=e){
            swap(arr[s], arr[e]);  
            s++;
            e--;
        }   
    }

    public static void main(String[] args) {
        int arr[] = new int []{6,2,3,4,5};
        int n = arr.length;
        ReverseArray(arr,n);
    }
}
