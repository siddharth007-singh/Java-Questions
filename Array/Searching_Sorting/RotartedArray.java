package Searching_Sorting;

public class RotartedArray {

    public static int binarySearch(int arr[], int s, int e, int key) {
        int start = s;
        int end = e;
        int mid = (start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

    public static int getpivort(int arr[], int n) {

        int s=0;
        int e = n-1;
        int mid = (s+e)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s =mid+1;
            }
            else{
                e=mid;
            }
            mid = (s+e)/2;
        }
        return s;
    }

    public static int main(String[] args) {
        int arr[] = new int[]{7,9,1,2,3};
        int n = arr.length;
        int key = 2;
        int pivort = getpivort(arr, n);
        if(key>=arr[pivort] && key<=arr[n-1]){
            return binarySearch(arr,pivort, n-1, key);
        }
        else{
            return binarySearch(arr,0, pivort-1, key);
        }
    }
}
