package Searching_Sorting;

public class SortRotateArray {

    public static int binarySerach(int arr[], int s, int e, int k) {

        int start =e;
        int end =e;
        int mid =(s+e)/2;

        while (start<=end) {
            if(arr[mid]==k){
                return mid;
            }

            if(k>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid =(s+e)/2;
        }   

        return -1;
    }

    public static int Pivort(int arr[], int n) {
        int s=0;
        int e=n-1;
        int mid  =(s+e)/2;
        
        while(s<e){
            if(arr[mid]>arr[0]){
                s = mid+1;
            }
            else{
                e=mid;
            }
            mid  =(s+e)/2;
        }
        return s;
    }

    public static int main(String[] args) {
        int arr[] = {7,9,1,2,3};
        int n = arr.length;
        int pivort=Pivort(arr,n);
        int key = 1;
        if(key>arr[pivort] && key<arr[n-1]){
            return binarySerach(arr, pivort, n-1, key);
        }
        else{
            return binarySerach(arr, 0, pivort-1, key);   
        }
    }
}
