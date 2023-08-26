package LeetCode;

public class Remove_Element {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int remove_val = 3;

        System.out.println(removeElement(arr,remove_val));
    }

    static int removeElement(int[] nums, int val){
        int i,j=0;

        for (i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
