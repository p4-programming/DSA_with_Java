package LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,6};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums){

        int xor = 0;

        for (int v:nums){
            xor = xor^v;
        }
        return xor;
    }
}
