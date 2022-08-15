package Searching_Sorting;


public class Pivort_Element{

    public static int Pivort(int arr[], int n) {
        int s=0, e=n-1;
        int mid = (s+e)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s = mid+1;
            }
            else{
                e =mid;
            }
            mid = (s+e)/2;
        }

        return s;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7,9,1,2,3};
        int n = arr.length;
        System.out.println("Finding Pivot Eleemnt Of The Array: ");
        int index = Pivort(arr,n);
        System.out.println(index);
    }
    
}