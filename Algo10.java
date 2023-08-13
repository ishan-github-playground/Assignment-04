import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Input a phone number:");
        String number;

        do{
            number = scanner.nextLine().strip();
            if(number.isEmpty()){
                System.out.println("Telephone number can't be empty");
                System.out.print("Enter it again:");

            }

        }while(number.isEmpty());

        boolean valid=false;

        if(number.length()==11&&number.charAt(0)=='0'&&number.charAt(3)=='-'){
            for (int i = 0; i < number.length(); i++) {
                if(number.charAt(i)=='-') continue;
                if(Character.isDigit(number.charAt(i))){
                    valid=true;
                }
                
            }


        }
        else if(number.length()==14&&number.substring(0,4).equals("+94 ")&&number.charAt(6)==' '){
            for (int i = 0; i < number.length(); i++) {
                if(number.charAt(i)==' '||number.charAt(i)=='+') continue;
                if(Character.isDigit(number.charAt(i))){
                    valid=true;
                }
            }
        }

        else System.out.println("Invalid phone number");

        if(valid) System.out.println("Number is validated");
    }
}
