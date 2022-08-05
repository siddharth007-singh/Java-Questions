import java.util.*;;
public class ArrayOne {
    // public static void main(String[] args){
    //     //Java Array Define
    //     int Marks[] = new int[3];
    //     Marks[0] = 22;
    //     Marks[1] = 20;
    //     Marks[2] = 24;

    //     for(int i=0; i<3; i++){
    //         System.out.println(Marks[i]);
    //     }
    // }   

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     try{
    //         int size = sc.nextInt();
    //         int Number[] = new int[size];

    //         //Taking The Array Input From The user;
    //         for(int i=0;i<=size;i++){
    //             Number[i] = sc.nextInt();
    //         }

    //         //Print That number
    //         for(int i=0;i<=size;i++){
    //             System.out.println(Number[i]);
    //         }

    //     }finally{
    //         sc.close();
    //     }
    // } 

    public static void check(int arr[], int key){
        // boolean test = false;
        for (int i=0; i<=arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Is " + key+ " present in the array: " + i);
                break;
            }
        }
        // System.out.println("Is " + key+ " present in the array: " + test);
    }


    public static void main(String[] args){
        int key=5;
        int arr[] = {1, 1, 9, 7, 2, 6, 10, 5 };

        System.out.println("Array: "+ Arrays.toString(arr));
        check(arr, key);
    } 
}
