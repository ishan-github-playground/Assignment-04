import java.util.Arrays;

public class Algo04 {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int start;
        int end;

        for (int i = 0; i < nums.length/2; i++) {
            start=nums[i];
            end=nums[nums.length-1-i];
            nums[i]=end;
            nums[nums.length-1-i]=start;

        }
        System.out.println(Arrays.toString(nums));
        
    }
}
