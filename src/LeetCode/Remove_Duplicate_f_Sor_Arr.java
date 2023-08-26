package LeetCode;

public class Remove_Duplicate_f_Sor_Arr {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,2};
        removeDuplicate(arr);
    }

    static int removeDuplicate(int[] nums){
        int i,j=0;
        for (i=0; i<nums.length;i++){
            if (nums[j] != nums[i]){
                nums[++j] = nums[i];
                System.out.println(nums[j] +", ");
            }
        }
        return ++j;
    }
}
