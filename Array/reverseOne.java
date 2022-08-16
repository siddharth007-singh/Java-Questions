package Array;

public class reverseOne {

    public static int Reverse(int arr[], int n) {
        int s=0; 
        int e=n-1;
        while(s<=e){
            swap(arr[s], arr[e]);
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {11, 7, 3, 12, 4};
        int n = arr.length;
        System.out.println(Reverse(arr, n));
    }
}
