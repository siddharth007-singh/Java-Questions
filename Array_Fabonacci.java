public class Array_Fabonacci {

    public static void FaboNaci(int a, int b, int c, int n) {
        for(int i=0; i<=n; i++ ){
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a+b;
        }
    }

    public static void main(String[] args) {
        int a = 0, b = 1, c=1, n=10;
        FaboNaci(a, b, c, n);
    }   
}   


//Recursion

// public class Array_Fabonacci{

//     public static int fibonacci(int n) {
// 		if (n <= 1)
// 			return n;
// 		return fibonacci(n - 1) + fibonacci(n - 2);
// 	}

// 	public static void main(String args[]) {
// 		int n = 10;
// 		System.out.println(fibonacci(n));
// 	}
// }