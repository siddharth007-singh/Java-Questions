package Array;

public class CheckSortRotated {

    public static boolean Check(int arr[], int n){
        int count=1;
        for(int i=0; i<n; i++){
            if(arr[i-1]>arr[i]){
                count ++;
            }
        }
        //Cyclic Comparision
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int n = arr.length;
        Check(arr,n);
    }
    
}

// AGar mera count 0 ya 1 hai toh true else false hoga
