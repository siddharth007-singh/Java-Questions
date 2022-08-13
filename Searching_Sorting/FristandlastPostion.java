package Searching_Sorting;

public class FristandlastPostion {

    public static int FristMost(int arr[], int n, int key) {
        int s=0, e=n-1;
        int mid = (s+e)/2;
        int ans=-1;

        while(s<=e){
            if(arr[mid]==key){
                ans=mid;
                e=mid-1;
            }
            else if(key>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        mid = (s+e)/2;

        return -1;
    }


    int arr[] = new int[]{1,2,3,3,5};
    int n = arr.length;
    int key = 3;
    int index = FristMost(arr, n, key);
    System.out.println(index);
    
}
