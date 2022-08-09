package Array;

//Using XoR gate formula
public class unique_element {
    public static void main(String[] args) {
        int arr[] = new int []{1,2,1,2,3};
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<=n; i++){
            ans = ans^arr[i];

        }
        System.out.println(ans);
    }
}
