package Searching_Sorting;

public class Square {

    public static int SquareNum(int num) {
        int s=0, e=num-1;
        int mid = (s+e)/2;

        while(s<=e){
            int squre = mid*mid;
            if(squre==num){
                return mid;
            }

            if(squre>mid){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = 27;
        System.out.println(SquareNum(num));
    }
}
