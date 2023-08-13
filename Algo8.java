public class Algo8 {
    public static void main(String[] args) {
        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};
        String num1="";
        String num2=numA[0]+" ";
        String num3="";
        String num4="";
        
        String num6="";
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
        for (int i = 1; i < numA.length; i++) {
            if(numA[0]!=numA[i]&&!num2.contains(Integer.toString(numA[i]))) num2+=numA[i]+" ";   
        }
        for (int i = 0; i < numA.length; i++) {
            if(num2.contains(Integer.toString(numB[i]))){
                continue;
            }
            num2+=numB[i]+" ";  
        }
        System.out.println(num2);



        for (int i = 0; i < numB.length; i++) {
            num3+=(numA[i]/numB[i])+" ";
        }
        System.out.println(num3);
        for (int i = 0; i < numB.length; i++) {
            num4+=(numB[i]/numA[i])+" ";
        }
        System.out.println(num4);
        String[] nm4=num1.split(" ");
        String[] num5 = num2.split(" ");
       
        
        for (int i = 0; i < nm4.length-1; i++) {

            for (int j = 0; j < num5.length; j++) {
                if(!nm4[i].equals(num5[j])&&!nm4[i+1].equals(num5[j])&&!num6.contains(num5[j])){
                    num6+=num5[j]+" ";

                }
            }
        }
        System.out.println(num6);

    }
}
