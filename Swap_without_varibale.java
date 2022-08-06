public class Swap_without_varibale {

    public static void Swap(int a , int b){
        b = b+a; //30
        a = b-a; //20 check
        b = b-a; // 10 check

        System.out.println("Variales  After Swapping a : " + a);
        System.out.println("Variales  After Swapping b : "+ b);


    }

    public static void  main(String args[]){
        int a = 10, b=20;
        System.out.println("Variales  Before Swapping a : "+ a);
        System.out.println("Variales  Before Swapping b : "+ b);
        System.out.println("-----------------------------------");
        Swap(a, b);
        
    }
}
