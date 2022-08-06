public class Array_Vowels {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        int conut = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'|| str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== '0' || str.charAt(i)== 'u'){
                conut++;
            }
        }
        System.out.println("Total no of vowels in string are: " + conut);
    }
}
