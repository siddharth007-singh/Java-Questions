import java.util.*;

public class Array_asc_dsc {


    public static void SortingAscDsc(int Sort[]) {
        boolean isAscending = false;
        for(int i=0;i<=Sort.length; i++){
            if(Sort[i]<Sort[i+1]){
                isAscending = true;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
    

    public static void main(String args[]){
        int Sort[]  =new int[]{3, 4, 6, 2};
        //Print The array Frist;
        System.out.println("Array: "+ Arrays.toString(Sort));
        SortingAscDsc(Sort);
    }
}