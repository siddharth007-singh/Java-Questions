package Array;
import java.util.Arrays;

public class Pair_sum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int key= 5;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==key){
                    System.out.println(min(arr[i], arr[j]));
                    System.out.println(max(arr[i], arr[j]));
                }
            }
        }
    }
}
