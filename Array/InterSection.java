public class InterSection {

    public static void InterSections(int arr1[], int arr2[],int n, int m) {
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }

            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }   
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {4,5,6};
        int n = arr1.length;
        int m = arr2.length;

        InterSections(arr1, arr2, n, m);
    }    
}
