import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class KFreq {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Find top k frequent elements
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxKey = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            ans[i] = maxKey;
            map.remove(maxKey);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}