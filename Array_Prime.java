public class Array_Prime {

    public static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i = 2; i <= num / 2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true; 
    }    

    public static void main(String[] args) {
        int num = 49;
        System.out.println(isPrime(num));
    }
}
