class Solution {
    public void sortColors(int[] nums) {
        
        int low=0,mid=0,high=nums.length-1,temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}