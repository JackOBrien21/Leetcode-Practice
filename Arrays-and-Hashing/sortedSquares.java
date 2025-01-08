class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int end = nums.length-1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[end--] = nums[left]*nums[left];
                left++;
            } else {
                ans[end--] = nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
}