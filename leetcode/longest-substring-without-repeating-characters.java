import java.util.HashMap;

class Solution {
    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    public static int lengthOfLongestSubstring(String s) {
        int count = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count = 0;
                i = map.get(s.charAt(i)) + 1;
                map.clear();
            }
            map.put(s.charAt(i), i);
            count++;
            if (count > max)
                max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}