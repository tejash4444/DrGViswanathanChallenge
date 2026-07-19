class Solution {
public:
    bool check(vector<int>& nums) {
        int bp = 0;
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i+1]) { 
                bp++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            bp++;
        }
        return bp <= 1;
    }
};