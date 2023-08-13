import java.util.Scanner;

public class Algo09 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        boolean invalid;
        String word;


        do{
        invalid=false;
        System.out.print("Input a single word: ");
        word = scanner.nextLine();
        String[] split = word.split(" ");
        if(split.length>1)
        {
            System.out.println("Invalid");
            invalid=true;
        }


        }while(invalid);

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                invalid=true;
            }
            
        }
        if(!invalid){
        System.out.println("it is a palindrome");
        }
        else System.out.println("it is not a palindrome");



        

    }
}
