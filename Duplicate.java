public class Duplicate {

    public static int Duplicates(int arr[], int n) {
            int ans =0;
            for(int i=0; i<n; i++){
                ans = ans^arr[i];
            }

            for(int i=1; i<n; i++){
                ans = ans^arr[i];
            }
            return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        int n = arr.length;

        System.out.println("The Duplicate Number In This Array Is : "+Duplicates(arr, n));
    }
}
