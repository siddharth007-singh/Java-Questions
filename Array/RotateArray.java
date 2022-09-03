package Array;

public class RotateArray {

    public static void Rotate(int arr[], int n, int k, int temp[]) {
        for(int i=0; i<n; i++){
            temp[(i+k)%n] = arr[i];
        }
        arr = temp;
    }

    public static void main(String[] args) {
        int arr[] = {11, 7, 3, 12, 4};
        int n = arr.length;
        int key = 2;
        int temp[] = {0};
        Rotate(arr, n, key, temp);
    }
}



// arr[(i+k)%n] = arr[i]
// this is the formula of Shifting The Element by cyclic Way