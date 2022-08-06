import java.util.*;

public class Array_Max_Min {
    // Find Maxium And Minium Number in an array

    public static void FindMaxMin(int arr[], int max, int min){
        for(int i=0; i<=arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
            else{
                max = arr[i];
            }

            System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);
        }
    }

    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6};
        System.out.println("Array: "+ Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        FindMaxMin(arr, max, min);
    }   

}
