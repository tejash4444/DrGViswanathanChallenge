/* MAIN FUNCTION IS WRITTEN BY AI */
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] arr = strs[i].toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

/* MAIN FUNCTION IS WRITTEN BY AI */
    public static void main(String[] args) {

        Solution sol = new Solution();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = sol.groupAnagrams(strs);

        System.out.println(result);
    }
}