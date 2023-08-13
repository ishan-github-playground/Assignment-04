import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("enter a Sentences:"); 
       String sentence=scanner.nextLine().strip();
       if(!sentence.isEmpty()){
       String[] split = sentence.split(" ");
       String shortest=split[0];
       String longest=split[0];
       for (int i = 1; i < split.length; i++) {
        if(shortest.length()>split[i].length()){
            shortest=split[i];
        }
        if(longest.length()<split[i].length()){
            longest=split[i];
        }   
       }
       System.out.println("shortest word is : "+shortest);
       System.out.println("longest word is: "+longest);
    }
    else System.out.println("Empty");
}

}
