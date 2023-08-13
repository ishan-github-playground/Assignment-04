public class Algo8 {
    public static void main(String[] args) {
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};
        String num1="";
        String num2="";
        for (int i = 0; i < numA.length; i++) {
            if(num1.contains(Integer.toString(numA[i]))){
                continue;
            }
            for (int j = 0; j < numB.length; j++) {
                if(numA[i]==numB[j]){
                    num1+=numA[i]+" ";
                }
            }
        }
        System.out.println(num1);
        for (int i = 0; i < numA.length; i++) {
            num2+=numA[i]+" ";   
        }
        for (int i = 0; i < numA.length; i++) {
            if(num2.contains(Integer.toString(numB[i]))){
                continue;
            }
            num2+=numB[i]+" ";
            
        }
        System.out.println(num2);

    }
}
