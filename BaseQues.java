import java.util.*;
public class BaseQues {
    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter The Table Number we want : ");
            num = sc.nextInt();
            for(i = 1; i<=10; i++){
                System.out.println(num * i);
            }
        }finally{
            sc.close();
        }
    }
}
