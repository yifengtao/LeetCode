public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length; 
        int dup1 = nums[0];
        int dup2 = nums[1];
        int end = 2;
        
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != dup1) {
                nums[end] = nums[i];
                dup1 = dup2;
                dup2 = nums[i];
                end++;
            }
        }
        return end;
    }
}