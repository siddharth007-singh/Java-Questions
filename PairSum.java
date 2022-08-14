public class PairSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int n = arr.length;
        int key = 9;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==key){
                    System.out.println("The pair is are as Follow: "+ i);
                    System.out.println("The pair is are as Follow: "+ j);
                }
            }
        }
    }
}
