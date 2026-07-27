class Solution {
    public int majorityElement(int[] nums) {
        int f=0;
        int c=nums[0];
        for (int i=0;i<nums.length;i++){
            if(c==nums[i]){f++;}
            else{f--;}
            if(f==0){
            c=nums[i];
            f=1;
            }
        }
        if(f>0){return c;}
        return -1;
    }
}