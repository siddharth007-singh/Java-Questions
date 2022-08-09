import java.util.Arrays;
public class Frequency{

    public static void countOccurance(int arr[]) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int count =1;
            if(i!=arr.length-1){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]==arr[j])
                        count++;
                    else
                        break;
                }
            }
            System.out.println(arr[i]+" -> "+ count);
            i+=(count-1);
        }
    } 


    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2};
        countOccurance(arr);
    }
}