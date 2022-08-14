package Searching_Sorting;

public class binary_search {

    public static int BinarySerach(int arr[], int n, int key) {
        int s=0, e=n-1;
        int mid = (s+e)/2;

        while(s<=e){
            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid=(s+e)/2
        }
        return -1;
    }   

    public static void main(String[] args) {
        int arr[] = new int[]{3,5,9,13,27};
        int n = arr.length;
        int key = 13;
        int index = BinarySerach(arr, n, key);
        System.out.println("The Index Number is: "+ index);
    }
}
