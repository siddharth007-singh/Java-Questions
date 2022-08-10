package Array;

public class TriplateSum {

    public static void triplet_sum(int arr[], int n, int key) {
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==key){
                        System.out.println("The Sum Is : "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int key =12;
        triplet_sum(arr, n,key);
    }
}
