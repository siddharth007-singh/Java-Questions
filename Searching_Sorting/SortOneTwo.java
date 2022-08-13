package Searching_Sorting;

public class SortOneTwo {
    public static void PrintArray(int arr[], int n) {
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,1,2,1,0,2};
        int n = arr.length;

        int s=0, m=0, e=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                s++;
            }
            else if(arr[i]==1){
                m++;
            }
            else if(arr[i]==2){
                e++;
            }
        }

        for(int i=0;i<s;i++){
            arr[i]=0;
        }
        for(int i=s;i<s+m;i++){
            arr[i]=1;
        }
        for(int i=s+m;i<(s+m+e);i++){
            arr[i]=2;
        }

        PrintArray(arr,n);
    }
}
