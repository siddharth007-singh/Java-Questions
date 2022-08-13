public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int key = 5;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==key){
                    System.out.println("The pair is are as Follow: "+ arr[i]);
                    System.out.println("The pair is are as Follow: "+ arr[j]);
                }
            }
        }
    }
}
