package Array;

public class Swap_alternate {
       public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        int n = arr.length;
        System.out.println("The Lenght of the array is : "+ n);
        int s; //Variable for swap
        for(int i=0;i<=n;i++){
            while(i<n){
                s = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = s;
                i = i+2;
            }
            System.out.println(arr[i]);
        }   
       }
}
