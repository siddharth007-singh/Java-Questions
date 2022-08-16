package Array;

public class Merge_sorted_array {

    public static void PrintArray(int arr3[]) {
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]+ " ");
        }
    }

    public static void MergeArray(int arr1[], int arr2[], int n, int m, int arr3[]) {
        int k = 0, i=0, j=0;

        for(i=0;i<n;i++){
            for(j=0; j<m; j++){
                if(arr1[i]<arr2[j]){
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                }
                else{
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }

        while(arr1[i]<n){
            arr3[k] = arr1[i++]; 
        }

        while(arr2[j]<m){
            arr3[k] = arr2[j++]; 
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6};
        int arr3[] ={0};
        int n= arr1.length;
        int m = arr2.length;

        MergeArray(arr1, arr2, n, m, arr3);
        PrintArray(arr3);

    }
}
