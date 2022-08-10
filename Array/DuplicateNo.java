package Array;
//By using xor
public class DuplicateNo {

    public static int Duplicate(int arr[], int n){
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        for(int i=1;i<n;i++){
            ans = ans^arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        int n = arr.length;
        System.out.println("The Duplicate Number In This Array Is :"+Duplicate(arr, n));
    }   
}
