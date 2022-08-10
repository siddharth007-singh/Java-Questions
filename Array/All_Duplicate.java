package Array;


public class All_Duplicate {

    public static int AllDuplicate(int arr[], int n) {
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        for(int i=1;i<n;i++){
            ans = ans^arr[i];
        }
        // return ans;
    }   

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,4};
        int n = arr.length;
        System.out.println("All Duplicate Number In This Array Is :"+AllDuplicate(arr, n));
    }   
}
