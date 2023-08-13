import java.util.Scanner;

public class Algo01{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a number:");
        int number = scanner.nextInt();
        if(number<0) System.exit(2);



        int f0=0;
        int f1=1;
        int n=2;
        int ans;
        if(number==0) {
            System.out.println(0);
            System.exit(2);}
        do{

            ans=f0+f1;
            f0=f1;
            f1=ans;
            n++;

        }while(number+1>n);
        System.out.println(ans);
        
    }
}