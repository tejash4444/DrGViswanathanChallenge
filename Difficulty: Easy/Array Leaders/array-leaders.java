class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
