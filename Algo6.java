import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a text(ASCII) only: ");

            String text=scanner.nextLine().strip();
            char[] char1 = text.toCharArray();
            String[] array =text.split(" ");
            boolean valid=true;
            
            
            if(text.isEmpty()){
                System.out.println("Invalid text");
            }
            for (int i = 0; i < text.length(); i++) {
                if(char1[i]>127||char1[i]<0){
                    System.out.println("Invalid text");
                    valid=false;
                }
            }
            if(valid){
                text="";
                for (int i = 0; i < array.length; i++) {
                    text+=array[array.length-1-i]+" ";
                }
            } 
            System.out.println(text);

    }while(true);
}
}
