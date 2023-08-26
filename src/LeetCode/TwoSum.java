package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,78,8,2,4};
        int target = 11;

        int[] result = twoSum(arr,target);

        for (int k=0; k<result.length;k++){
            System.out.println(result[k]);
        }
    }

    static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        return null;
    }
}