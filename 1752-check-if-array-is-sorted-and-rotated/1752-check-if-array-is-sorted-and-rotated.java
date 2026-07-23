class Solution {
    public boolean check(int[] nums) {
        int b=0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                b++;
                if (b==2){return false;}
            }
        }
        if(nums[0]>=nums[nums.length-1] || b==0){return true;}
        else{return false;}
    }
}