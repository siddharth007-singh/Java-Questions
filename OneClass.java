import java.util.*;
public class OneClass{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int Natural, sum = 0 , i;
        try{
            System.out.println("Enter the Number we want : ");
            Natural = inp.nextInt();
            for(i=0; i<=Natural; i++){
                sum = sum + i; 
            }
            System.out.println(sum);
        }
        finally{
            inp.close();
        }
    }
}