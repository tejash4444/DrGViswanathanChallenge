class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);

        int b = nums[len - 1] * nums[len - 2] * nums[len - 3];

        if (nums[1] < 0) {
            int a = nums[0] * nums[1] * nums[len - 1];
            if (a > b) {
                return a;
            }
        }

        return b;
    }
}
