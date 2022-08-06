public class Array_Panildrom{

    public static boolean isPanildrom(int arr[], int s, int e) {
        if(s==e)
        return true;

        if(arr[s]!=arr[e])
        return false;

        if(s<=e+1){
            return isPanildrom(arr, s+1, e-1);
        }
        return true;
    }
    

    public static void main(String[] args) {
        int arr[] =  new int[]{1,6,6,1};
        int size = arr.length;
        int s=0;
        int e=size-1;
        if(isPanildrom(arr, s, e)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}