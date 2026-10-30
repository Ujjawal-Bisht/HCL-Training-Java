//643 Maximum Average Subarray I 

class Solution1 {
    public double findMaxAverage(int[] nums, int k) {
        // Find the sum of the first window of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add new element, remove old element
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average
        return maxSum / k;
    }
}