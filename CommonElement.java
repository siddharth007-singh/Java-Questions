public class CommonElement {


    public static void Common(int arr1[], int arr2[], int arr3[], int m, int n, int o) {
        int i=0, j=0, k=0;
        while(i<n && j<m && k<o){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {4,5,6,7};
        int arr3[] = {7,8,9,10};
        int n = arr1.length;
        int m = arr2.length;
        int o = arr3.length;
        
        Common(arr1, arr2,arr3, n, m, o);
    }
}
