import java.util.*;
public class BaseQuesTwo {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Want to continue ? (yes(1) or no(0))");
        input = sc.nextInt();
        try{
            while(input==1){
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid");
                }
            }
        }finally{
            sc.close();
        }
    }   
}
