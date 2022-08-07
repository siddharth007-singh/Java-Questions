package Array;

public class Linear_search {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int key = 3;
        int size = arr.length;
        for(int i=0;i<size-1; i++){
            if(arr[i]==key){
                System.out.println("founded");
            }
            else{
                System.out.println("element not found");
            }
        }
    }
}
