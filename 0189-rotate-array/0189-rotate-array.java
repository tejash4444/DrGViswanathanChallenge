class Solution {
    public void rotate(int[] nums, int k) {
        int c=0;
        int[] arr = new int[nums.length];
        k = k % nums.length;

        for (int i=nums.length-k;i<nums.length;i++){
            arr[c]=nums[i];
            c++;
        }
        for (int i=0;i<nums.length-k;i++){
            arr[c]=nums[i];
            c++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}