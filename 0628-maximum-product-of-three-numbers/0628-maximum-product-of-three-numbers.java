class Solution {
    public int maximumProduct(int[] nums) {
        int[] result = new int[nums.length];
        int index=0;
        int len=nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) {
                result[index++] = nums[i];
            }
        }
        int b = result[len-1]*result[len-2]*result[len-3];
        if(result[1]<0){
            int a = result[0]*result[1]*result[len-1];
            if(a > b){
                return a;
            }
        }
        return b;
    }
}