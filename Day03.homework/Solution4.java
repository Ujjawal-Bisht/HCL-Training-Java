class Solution4 {
    public int[] runningSum(int[] nums) {
        // Modify the array in-place to store the running sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // Current element = current element + previous running sum
        }
        return nums;
    }
}