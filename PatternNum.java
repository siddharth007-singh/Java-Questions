// public class PatternNum {
//     public static void main(String[] args){
//         int i, j;
//         for(i= 1; i<=5; i++){
//             for(j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//VVIP
// public class PatternNum {
//     public static void main(String[] args){
//         int i, j, n=5;
//         for(i=1; i<=5; i++){
//             for(j=1; j<=n-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class PatternNum {
//     public static void main(String[] args){
//         int i, j, number=1;
//         for(i=1; i<=5; i++){
//             for(j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }


//VVVVVVVVIP
// yaha pr humne i and j ke indexs ko Matrix ke form me nikal kr  Add kiya  or Agar (i+j) ka sum even Hua toh 1 print hua or Agar dono ka sum odd hua toh 0 Print Hua 
public class PatternNum{
    public static void main(String[] args){
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
               if((i+j)%2==0){
                System.out.print("1" + " ");
               }
               else{
                System.out.print("0" +" ");
               }
            }
            System.out.println();
        }
    }
}
